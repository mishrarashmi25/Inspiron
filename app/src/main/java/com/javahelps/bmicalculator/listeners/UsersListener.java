package com.javahelps.bmicalculator.listeners;

import com.javahelps.bmicalculator.models.User;

public interface UsersListener {
    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);
}
