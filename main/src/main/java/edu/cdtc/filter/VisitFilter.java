package edu.cdtc.filter;

import edu.cdtc.entity.User;
import edu.cdtc.entity.UserVisit;
import edu.cdtc.service.UserVisitService;
import edu.cdtc.util.IpUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Set;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/14
 */
@WebFilter
public class VisitFilter extends HttpFilter {
    private static final Logger LOGGER = LoggerFactory.getLogger(VisitFilter.class);

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final Set<String> visitPath = Set.of("/");

    private static final String FIRST_FLAG = "isFirst";
    private static final String USER_LOGIN_FLAG = "user";

    @Autowired
    private UserVisitService userVisitService;

    @Override
    protected void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        String requestURI = request.getRequestURI();
        // 记录访问频次
        if (visitPath.contains(requestURI)) {
            // 第一次访问并且为登录状态
            if (request.getSession().getAttribute(FIRST_FLAG) == null && request.getSession().getAttribute(USER_LOGIN_FLAG) != null) {

                User user = (User) request.getSession().getAttribute(USER_LOGIN_FLAG);

                UserVisit userVisit = new UserVisit();
                userVisit.setIpAddr(IpUtil.getRemoteAddr());
                userVisit.setCreateTime(DATE_TIME_FORMATTER.format(LocalDateTime.now()));
                userVisit.setUserId(user.getId());
                userVisit.setUsername(user.getUsername());

                userVisitService.save(userVisit);

                LOGGER.info("系统访问: {} {}", user.getId(), user.getUsername());
                request.getSession().setAttribute(FIRST_FLAG, true);
            }
        }
        chain.doFilter(request, response);
    }
}
