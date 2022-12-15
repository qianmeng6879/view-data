package edu.cdtc.controller;

import edu.cdtc.dto.EpidemicData;
import edu.cdtc.entity.User;
import edu.cdtc.entity.UserVisit;
import edu.cdtc.service.PatientService;
import edu.cdtc.service.ProvinceofchinaService;
import edu.cdtc.service.UserVisitService;
import edu.cdtc.service.VisitService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zero
 * @email qianmeng6879@163.com
 * @since 2022/12/13
 */
@Controller
public class DataController {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataController.class);
    @Autowired
    private ProvinceofchinaService service;

    @Autowired
    private UserVisitService userVisitService;

    @RequestMapping("/")
    public String dataPage(HttpServletRequest request, Model model) throws IOException {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/login";
        }

        EpidemicData epidemicData = service.getEpidemicData();

        model.addAttribute("data", epidemicData);
        model.addAttribute("visit", userVisitService.count());

        LOGGER.info(epidemicData.toString());
        return "data";
    }
}
