package org.codingwallah.emproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
        private Long id;
        private String name;
        private String phone;
        private String dob;
        private String email;
        private String addres;
        private String role;
        private Long adhar;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getPhone() {
                return phone;
        }

        public void setPhone(String phone) {
                this.phone = phone;
        }

        public String getDob() {
                return dob;
        }

        public void setDob(String dob) {
                this.dob = dob;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public String getAddres() {
                return addres;
        }

        public void setAddres(String addres) {
                this.addres = addres;
        }

        public String getRole() {
                return role;
        }

        public void setRole(String role) {
                this.role = role;
        }

        public Long getAdhar() {
                return adhar;
        }

        public void setAdhar(Long adhar) {
                this.adhar = adhar;
        }
}
