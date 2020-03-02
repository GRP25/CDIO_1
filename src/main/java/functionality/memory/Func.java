package functionality.memory;

import java.util.ArrayList;

import data.UserDTO;
import functionality.IFunc;

public class Func implements IFunc {

    @Override
    public UserDTO getUser(int userID) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void updateUser(int userID, String Username, String initials, int CPR, String password,
            ArrayList<Integer> roles) {
        // TODO Auto-generated method stub

    }

    @Override
    public void createUser(String Username, String initials, int CPR, String password, ArrayList<Integer> roles) {
        // TODO Auto-generated method stub

    }

    @Override
    public void deleteUser(int userID) {
        // TODO Auto-generated method stub

    }

    @Override
    public ArrayList<UserDTO> getUserList() {
        // TODO Auto-generated method stub
        return null;
    }
}