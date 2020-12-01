package br.univille.cademeututor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.univille.cademeututor.model.UserMember;
import br.univille.cademeututor.services.impl.UserServiceDetail;

@Component
public class StartApplication implements ApplicationRunner {
    @Autowired
    private UserServiceDetail service;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        UserMember userAdm = service.searchUser("admin");
        if (userAdm == null) {
            userAdm = new UserMember();
            userAdm.setName("admin");
            userAdm.setPassword("admin123456789");
            service.save(userAdm);
            System.out.println("Salva senha " + userAdm.getPassword());
        }
        System.out.println("Salva senha " + userAdm.getPassword());
    }
}