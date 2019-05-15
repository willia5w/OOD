/**
 *	Represents	an	Address	and all of its components
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
     * Creates	an address
     *
     * @param    streetNumber    the	author's	street number
     * @param    streetName    the author's	street name
     * @param    cityName   the	authors	city name
     * @param    stateAcronym    the	author's	state acronym
     * @param    zipCode    the	author's	zip code
     * @param    countryName    the	authors	country name
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
     * @return the street number
     */
    public String getStreetNumber() {
        return this.streetNumber;
    }
    /**
     * @return the street name
     */
    public String getStreetName() {
        return this.streetName;
    }
    /**
     * @return the city name
     */
    public String getCityName() {
        return this.cityName;
    }
    /**
     * @return the state acronym
     */
    public String getStateAcronym() {
        return this.stateAcronym;
    }
    /**
     * @return the zip code
     */
    public String getZipCode() {
        return this.zipCode;
    }
    /**
     * @return the country name
     */
    public String getCountryName() {
        return this.countryName;
    }
    /**
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
