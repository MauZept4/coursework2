package com.example.tourism.service.activities.interfaces;

import com.example.tourism.model.Activities;

import java.util.List;

public interface IActivitiesService {
    Activities getById(String id);
    Activities create(Activities activities);
    Activities update(Activities activities);
    Activities delete(String id);
    List<Activities> getAll();
}
