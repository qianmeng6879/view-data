package edu.cdtc.util;

import com.github.aidensuen.util.StringUtil;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/15
 */
public class IpUtil {
    private IpUtil() {

    }

    public static String getRemoteAddr() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        if (requestAttributes == null) {
            return "";
        }

        HttpServletRequest request = requestAttributes.getRequest();

        String ip = request.getHeader("x-forward-for");

        if (!StringUtil.hasLength(ip)) {
            ip = request.getHeader("X-Forward-For");
        }

        if (!StringUtil.hasLength(ip)) {
            ip = request.getRemoteAddr();
        }

        return ip;
    }
}
