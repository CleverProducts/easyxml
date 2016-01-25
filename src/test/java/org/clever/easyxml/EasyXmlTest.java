package org.clever.easyxml;

import org.clever.easyxml.impl.BindHandlerImp;
import org.clever.easyxml.impl.HandlerImp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.List;


/**
 * Created by sinan on 19.01.2016.
 */
public class EasyXmlTest {

    public void testParserHandler() throws IOException {
        HandlerImp handlerImp = new HandlerImp();
        EasyXml easyXml = new EasyXml(new FileInputStream(""));
        easyXml.parse(handlerImp);
    }

    public void testParseBin() throws IOException {
        EasyXml<Entity> easyXml = new EasyXml<Entity>(new FileInputStream(""));
        Entity entity = easyXml.marshall(Entity.class);
    }

    public void testParseBinHandler() throws IOException {
        EasyXml<Entity> easyXml = new EasyXml<Entity>(new FileInputStream(""));
        easyXml.marshall(Entity.class, new BindHandlerImp());
    }

    public void testParseObjectList() throws IOException {
        EasyXml<Entities> easyXml = new EasyXml<Entities>(new FileInputStream(""));
        Entities entities = easyXml.marshall(Entities.class);
    }

    static class Entities {
        private List<Entity> entities;

        public List<Entity> getEntities() {
            return entities;
        }

        public void setEntities(List<Entity> entities) {
            this.entities = entities;
        }
    }

    static class Entity {
        private long id;
        private int age;
        private String name;
        private String surname;
        private String phoneNumber;
        private Date birthDate;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public Date getBirthDate() {
            return birthDate;
        }

        public void setBirthDate(Date birthDate) {
            this.birthDate = birthDate;
        }
    }
}
