package ru.innopolis.homework018.tvapp.service;

import ru.innopolis.homework018.tvapp.model.TV;

import java.util.List;

public interface TVService {
    TV createTV(TV tv);
    TV updateTV(TV tv);
    void deleteTV(Long id);
    TV getTVById(Long id);
    List<TV> getAllTVs();
}
