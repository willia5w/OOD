package Problem2;

/**
 *	Represents	an	address	and all of its components
 *
 */

public class Address {
    private String streetNumber;
    private String streetName;
    private String cityName;
    private String stateAcronym;
    private String zipCode;
    private String countryName;


    /**
     * Creates	an Address object for a card holder given all address components
     *
     * @param    streetNumber   the card holder's	street number
     * @param    streetName    the card holder's	street name
     * @param    cityName   the card holder's	city name
     * @param    stateAcronym    the card holder's	state acronym
     * @param    zipCode    the card holder's	zip code
     * @param    countryName    the card holder's	country name
     */

    public Address (String streetNumber, String streetName, String cityName, String stateAcronym, String zipCode,
                   String countryName) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.cityName = cityName;
        this.stateAcronym = stateAcronym;
        this.zipCode = zipCode;
        this.countryName = countryName;
    }
    /**
     * Get the street number
     * @return the street number
     */
    public String getStreetNumber() {
        return this.streetNumber;
    }

    /**
     * Get the street name
     * @return the street name
     */
    public String getStreetName() {
        return this.streetName;
    }

    /**
     * Get the city name
     * @return the city name
     */
    public String getCityName() {
        return this.cityName;
    }

    /**
     * Get the state acronym
     * @return the state acronym
     */
    public String getStateAcronym() {
        return this.stateAcronym;
    }

    /**
     * Get the zip code
     * @return the zip code
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * Get the country name
     * @return the country name
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * Get the full address
     * @return the full address
     */
    public String getAddress() {
        return this.getStreetNumber()
                + " " + this.getStreetName()
                + " " + this.getCityName()
                + " " + this.getStateAcronym()
                + " " + this.getZipCode()
                + " " + this.getCountryName();
    }
    }
