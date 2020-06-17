package com.company;

public class Address {
    private String country;
    private String city;
    private String postal_code;
    private String street_name;
    private int apart_number;

    public String createAddress(String country) {
        return String.format("country = %s", country);
    }

    public String createAddress(String country, String city) {
        return String.format("country = %s, city = %s", country, city);
    }

    public String createAddress(String country, String city, String postal_code) {
        return String.format("country = %s, city = %s, postal_code = %s", country, city, postal_code);
    }

    public String createAddress(String country, String city, String postal_code, String street_name) {
        return String.format("country = %s, city = %s, postal_code = %s, street_name = %s", country, city, postal_code, street_name);
    }

    public String createAddress(String country, String city, String postal_code, String street_name, Integer apart_number) {
        return String.format("country = %s, city = %s, postal_code = %s, street_name = %s, apart_number = %d", country, city, postal_code, street_name, apart_number);
    }


}
