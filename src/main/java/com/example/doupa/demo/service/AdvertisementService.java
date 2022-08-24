package com.example.doupa.demo.service;

import com.example.doupa.demo.model.Advertisement;
import com.example.doupa.demo.repository.AdvertisementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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



}
