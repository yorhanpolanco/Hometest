package pojos;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class PetPojo {

    @JsonProperty
    private int id;

    @JsonFormat(with = JsonFormat.Feature.ACCEPT_SINGLE_VALUE_AS_ARRAY)
    private String category;

    @JsonProperty
    private String name;

    @JsonProperty
    private ArrayList photoUrls;

    @JsonProperty
    private ArrayList tags;

    @JsonProperty
    private String status;

    public int getPetId(){
        return id;
    }

    public String getPetStatus(){
        return status;
    }

    public String getPetName(){
        return name;
    }

//    public ArrayList getPetCategories(){
//        return category;
//    }

}
