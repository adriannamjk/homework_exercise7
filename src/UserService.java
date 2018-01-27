import java.util.*;
import java.util.stream.Collectors;

public class UserService{


    public static Person findOldestPerson(List <User> users) {
        Person theOldest = users.get(0).getPersonDetails();
        for (User user : users) {
            if (user.getPersonDetails().getAge() > theOldest.getAge()) {
                theOldest = user;
            }
        }
        return theOldest;
    }


    public static User findUserWithLongestUsername(List <User> users) {
        User theLongestUsername = users.get(0);
        for (User name : users) {
            if (theLongestUsername.getName().length() < name.getName().length()) {
                theLongestUsername = name;
            }
        }
        return theLongestUsername;
    }


    public static String getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(List <User> users) {
        List <String> listaPlusOsiemnascie = new ArrayList <String>();
        for (User user : users) {
            if (user.getPersonDetails().getAge() > 18) {
                listaPlusOsiemnascie.add(user.getPersonDetails().getName().toString());
                listaPlusOsiemnascie.add(user.getPersonDetails().getSurname().toString());
            }
        }
        return listaPlusOsiemnascie.toString();
    }


    public static List <String> getSortedPermissionsOfUsersWithNameStartingWithA(List <User> users) {
        List <String> listaUprawnienia = new ArrayList <>();
        for (User user : users) {
            if (user.getPersonDetails().getName().startsWith("A")) {
                listaUprawnienia.add(user.getRole().getPermissions().toString());
            }
            Collections.sort(listaUprawnienia);
        }
        return listaUprawnienia;
    }


    public static void printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(List<User> users) {
        for (User user : users) {
            if (user.getPersonDetails().getSurname().startsWith("S")) {
                System.out.println(user.getRole().getPermissions().toString());
            }
        }
    }


    public static Map <Role, List <User>> groupUsersByRole(List<User>users) {
        Map <Role, List <User>> mapaRolaListaUzytkownikow = new HashMap<>();
        Set <Role> keySet = mapaRolaListaUzytkownikow.keySet();
        Collection <List <User>> values = mapaRolaListaUzytkownikow.values();
        List <User> listaUzytkownikow = new ArrayList <>();
        for (Map.Entry <Role, List <User>> entry : mapaRolaListaUzytkownikow.entrySet()) {
            Role key = entry.getKey();
            List <User> value = entry.getValue();
        }

        return mapaRolaListaUzytkownikow;
    }


    public static Map <Boolean, List <User>> partitionUserByUnderAndOver18(List <User> users) {
        Map <Boolean, List <User>> userMap = users.stream().collect(Collectors.partitioningBy((User wiek) -> wiek.getAge() > 18));
        userMap.forEach((Boolean key, List<User> userList) -> System.out.println(key + " ->" + userList));

        return userMap;
    }



    public static List<User> findUsersWhoHaveMoreThanOneAddress(List<User>users) {
        List <User> listaOdfiltrowana = new ArrayList <>();
        for (User user : users) {
            if (user.getPersonDetails().getAddresses().size() > 1) {
                listaOdfiltrowana.add(user);
            }
        }
        return listaOdfiltrowana;
    }


}





