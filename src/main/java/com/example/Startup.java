package com.example;

import com.example.model.InheritedUser;
import io.quarkus.runtime.StartupEvent;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.transaction.Transactional;

@ApplicationScoped
public class Startup {

    @Transactional
    public void onServerStartup(@Observes StartupEvent ev)  {
        InheritedUser inheritedUser = new InheritedUser("John", "Smith");
        inheritedUser.isActive = true;
        inheritedUser.persist();
    }
}