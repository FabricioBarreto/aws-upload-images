package com.example.awsuploadimage.datastore;

import com.example.awsuploadimage.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile>  USER_PROFILE = new ArrayList<>();

    static {
        USER_PROFILE.add(new UserProfile(UUID.randomUUID(),"janetjones",null));
        USER_PROFILE.add(new UserProfile(UUID.randomUUID(),"antoniojuior",null));
    }

    public List<UserProfile> getUserProfile(){
        return USER_PROFILE;
    }

}
