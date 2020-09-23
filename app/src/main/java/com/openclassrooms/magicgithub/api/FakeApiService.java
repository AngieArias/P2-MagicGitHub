package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import java.util.Random;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        // DONE
        return users;
    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        // DONE
        this.getUsers().add(User.random());
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        // DONE
        users.remove(user);
    }
}
