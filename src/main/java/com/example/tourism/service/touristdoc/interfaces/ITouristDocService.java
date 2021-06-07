package com.example.tourism.service.touristdoc.interfaces;

import com.example.tourism.model.touristDoc;

import java.util.List;

public interface ITouristDocService {
    touristDoc getById(String id);
    touristDoc create(touristDoc touristDoc);
    touristDoc update(touristDoc touristDoc);
    touristDoc delete(String id);
    List<touristDoc> getAll();
}
