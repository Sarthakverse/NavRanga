package com.sarthak.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sarthak.model.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {



}
