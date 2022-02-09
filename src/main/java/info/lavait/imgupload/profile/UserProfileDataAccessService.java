package info.lavait.imgupload.profile;

import info.lavait.imgupload.datastore.FakeUserProfileDataStrore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserProfileDataAccessService {

    private final FakeUserProfileDataStrore fakeUserProfileDataStrore;

    @Autowired
    public UserProfileDataAccessService(FakeUserProfileDataStrore fakeUserProfileDataStrore) {
        this.fakeUserProfileDataStrore = fakeUserProfileDataStrore;
    }

    List<UserProfile> getUserProfiles() {
        return fakeUserProfileDataStrore.getUserProfiles();
    }
}
