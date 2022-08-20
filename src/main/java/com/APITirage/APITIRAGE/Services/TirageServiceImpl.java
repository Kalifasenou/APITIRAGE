package com.APITirage.APITIRAGE.Services;


import com.APITirage.APITIRAGE.Repositories.TirageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TirageServiceImpl implements TirageService{
    @Autowired
    TirageRepository tirageRepository;

    @Override
    public Iterable<Object[]> tirerAleatoirement(long id) {
        return tirageRepository.tirerAleatoirement(id);
    }

}
