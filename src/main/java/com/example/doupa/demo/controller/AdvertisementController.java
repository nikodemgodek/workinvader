package com.example.doupa.demo.controller;

import com.example.doupa.demo.model.Advertisement;
import com.example.doupa.demo.repository.AdvertisementRepository;
import com.example.doupa.demo.service.AdvertisementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class AdvertisementController {

    @Autowired
    private AdvertisementService advertisementService;

    @Autowired
    private AdvertisementRepository advertisementRepository;

    @GetMapping("/")
    public String displayOffers(Model model) {
        List<Advertisement> listOffers = advertisementService.listAll();
        model.addAttribute("advertisements", listOffers);
        model.addAttribute("entryCount", advertisementService.getEntryCount());
        return "index";
    }

    @GetMapping("/offers/{id}")
    public String displaySelectedOffer(@PathVariable("id") Long id, Model model) {

        Advertisement advertisement = advertisementService.findOfferById(id)
                .orElseThrow( () -> new IllegalArgumentException("Invalid offer id:" + id));

        model.addAttribute("ad", advertisement);
        return "offer";
    }
    @GetMapping("/create")
    public String addAdvertisement(Model model, Advertisement advertisement) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

        LocalDate today = LocalDate.now();
        LocalDate tomorrow = today.plusDays(1);
        System.out.println(tomorrow);
        model.addAttribute("minimumDate", tomorrow);
        model.addAttribute("ad", advertisement);

        List<String> listCurrencies = Arrays.asList("PLN", "EUR", "USD");
        model.addAttribute("listCurrencies", listCurrencies);

        List<String> listWorkMode = Arrays.asList("Fully Remote", "Hybrid", "Office");
        model.addAttribute("listWorkMode", listWorkMode);

        List<String> listContracts = Arrays.asList("Contract of employment", "B2B", "Contract of work", "Contract of mandate");
        model.addAttribute("listContracts", listContracts);
        return "createAdvertisement";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String checkPersonInfo(@Valid @ModelAttribute("ad") Advertisement ad, BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            List<String> listCurrencies = Arrays.asList("PLN", "EUR", "USD");
            model.addAttribute("listCurrencies", listCurrencies);

            List<String> listContracts = Arrays.asList("Contract of employment", "B2B", "Contract of work", "Contract of mandate");
            model.addAttribute("listContracts", listContracts);
            return "createAdvertisement";

        }else{
            System.out.println(ad);
            advertisementService.save(ad);
            return "create_success";
        }
    }

}
