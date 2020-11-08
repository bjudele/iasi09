package com.sda.iasi09.service;

import com.sda.iasi09.model.Person;
import com.sda.iasi09.model.Wallet;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Service
public class PersonService {

    public Person findRandomPerson() {
        Wallet wallet = new Wallet();
        wallet.setAmountOfCash(1234);

        Person person = new Person();
        person.setName("bogdan");
        person.setWallet(wallet);

        return person;
    }
    public List<Person> findRandomPersonList() {
        Wallet wallet = new Wallet();
        wallet.setAmountOfCash(1234);

        Person person = new Person();
        person.setName("bogdan");
        person.setWallet(wallet);

        return Arrays.asList(person, person);
    }
}
