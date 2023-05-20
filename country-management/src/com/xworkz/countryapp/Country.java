package com.xworkz.countryapp;

public class Country {

               int countryId;

               String countryCode;

               String countryName;

               int noOfStates;

               double population;

               String currency;

               String capital;

               String economy;

               public Country(){

                   System.out.println("constructor is created");

               }

               public void setCountryId(int countryId){

                   this.countryId = countryId;
               }
               public int getCountryId(){

                   return countryId;
               }
               public void setCountryName(String countryName){

                   this.countryName = countryName;
               }

               public String getCountryName(){

                   return countryName;
               }

               public void setCountryCode(String countryCode){

                   this.countryName = countryName;
               }

               public String getCountryCode(){

                   return countryCode;
               }

               public void setNoOfStates(int noOfStates){

                    this.noOfStates = noOfStates;
               }

               public int getNoOfStates(){

                   return noOfStates;
               }

               public void setPopulation(double population){

                    this.population = population;

               }

               public double getPopulation(){

                   return population;
               }

               public void setCurrency(String currency){

                   this.currency = currency;

               }

               public String getCurrency(){

                   return currency;
               }

               public void setCapital(){

                   this.capital = capital;
               }

               public String getCapital(String capital) {

                   return capital;

               }

               public void setEconomy(String economy){

                    this.economy = economy;

               }

               public String getEconomy(){

                   return economy;

               }





}
