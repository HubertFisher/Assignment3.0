package com.company.entities;

public class Buyer {
        private int id;
        private String name;
        private String surname;
        private boolean gender;

        public Buyer() {}

        public Buyer(String name, String surname, boolean gender) {
            setName(name);
            setSurname(surname);
            setGender(gender);
        }

        public Buyer(int id, String name, String surname, boolean gender) {
            setId(id);
            setName(name);
            setSurname(surname);
            setGender(gender);
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
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

        public boolean getGender() {
            return gender;
        }

        public void setGender(boolean gender) {
            this.gender = gender;
        }
}
