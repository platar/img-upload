package info.lavait.imgupload.datastore;

import info.lavait.imgupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStrore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "janetjones", null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "antoniojunior", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("c7431ab0-b465-4730-811d-3ae749221f3e"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("cb717fce-3b4d-4eba-a562-2315c00bc38c"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
