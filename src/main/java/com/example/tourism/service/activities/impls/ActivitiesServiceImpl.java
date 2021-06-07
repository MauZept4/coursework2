package com.example.tourism.service.activities.impls;

import com.example.tourism.model.Activities;
import com.example.tourism.repository.ActivitiesRepository;
import com.example.tourism.service.activities.interfaces.IActivitiesService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ActivitiesServiceImpl implements IActivitiesService {
    final ActivitiesRepository repository;

    public ActivitiesServiceImpl(ActivitiesRepository activitiesRepository) {
        this.repository = activitiesRepository;
    }


    @Override
    public Activities getById(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Activities create(Activities activities) {
        return repository.save(activities);
    }

    @Override
    public Activities update(Activities activities) {
        return repository.save(activities);
    }

    @Override
    public Activities delete(String id) {
        repository.deleteById(id);
        return null;
    }

    @Override
    public List<Activities> getAll() {
        return repository.findAll();
    }
}
