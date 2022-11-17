package com.alexlourinha.planmydate.service;

import com.alexlourinha.planmydate.entities.Activity;
import com.alexlourinha.planmydate.repositories.ActivityRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ActivityService {
  @Autowired
  private ActivityRepository activityRepository;
  public List<Activity> listAllActivities() {
    return activityRepository.findAll();
  }

  public void saveActivity (Activity activity) {
    activityRepository.save(activity);
  }

  public Activity getActivity(Integer id) {
    return activityRepository.findById(id).get();
  }

  public void deleteActivity(Integer id) {
    activityRepository.deleteById(id);
  }
}
