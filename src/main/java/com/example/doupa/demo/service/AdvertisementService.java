package com.example.doupa.demo.service;

import com.example.doupa.demo.model.Advertisement;
import com.example.doupa.demo.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

@Service
public class AdvertisementService {

    @Autowired
    private AdvertisementRepository advertisementRepository;

    public List<Advertisement> listAll() {
        return advertisementRepository.findAll();
    }

    public void save(Advertisement ad) {
        advertisementRepository.save(ad);
    }

    public Long getEntryCount() {
        return advertisementRepository.count();
    }

    public Optional<Advertisement> findOfferById(Long id) { return advertisementRepository.findById(id); }

    public void saveToDB(MultipartFile file, Advertisement ad)
    {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        if(fileName.contains("..")) {
            System.out.println("Invalid file");
        }
        try {
            ad.setImage(Base64.getEncoder().encodeToString(file.getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        advertisementRepository.save(ad);
    }

}
