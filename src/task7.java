import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task7 extends UserService{

    private static UserService userService;

    public static void main(String[] args) {

        List <User> users = new ArrayList <>();

        //first user
        User user1 = new User();
        user1.setName("user1");
        user1.setPassword("pass1");

        Person personDetails1 = new Person();
        personDetails1.setAge(11);
        personDetails1.setName("Marek");
        personDetails1.setSurname("Sowa");

        Permission uprawnienie1 = new Permission();
        uprawnienie1.setName("up1");
        Permission uprawnienie2 = new Permission();
        uprawnienie2.setName("up2");
        List <Permission> uprawnienia = Arrays.asList(uprawnienie1, uprawnienie2);

        Role rola1 = new Role();
        rola1.setName("rola1");
        rola1.setPermissions(uprawnienia);

        personDetails1.setRole(rola1);
        personDetails1.setPhoneNumbers(Arrays.asList("0000", "1111", "9999"));

        Address adres1 = new Address();
        adres1.setCity("city");
        adres1.setCountry("country");
        adres1.setFlatNumber(1);
        adres1.setHouseNumber(1);
        adres1.setPostCode("9999");
        adres1.setStreetName("street");

        Address adres2 = new Address();
        adres2.setCity("city");
        adres2.setCountry("country");
        adres2.setFlatNumber(1);
        adres2.setHouseNumber(1);
        adres2.setPostCode("9999");
        adres2.setStreetName("street");

        personDetails1.setAddresses(Arrays.asList(adres1, adres2));

        user1.setPersonDetails(personDetails1);

        // 2gi uzytkownik
        User user2 = new User();
        user2.setName("user22");
        user2.setPassword("pass2");

        Person personDetails2 = new Person();
        personDetails2.setAge(12);
        personDetails2.setName("Marek2");
        personDetails2.setSurname("Sowa2");

        Permission uprawnienie3 = new Permission();
        uprawnienie3.setName("up1");

        List <Permission> uprawnienia2 = Arrays.asList(uprawnienie3);
        Role rola2 = new Role();
        rola2.setName("rola2");
        rola2.setPermissions(uprawnienia);

        personDetails2.setRole(rola2);
        personDetails2.setPhoneNumbers(Arrays.asList("0000", "1111", "9999"));

        Address adres3 = new Address();
        adres3.setCity("city");
        adres3.setCountry("country");
        adres3.setFlatNumber(1);
        adres3.setHouseNumber(1);
        adres3.setPostCode("9999");
        adres3.setStreetName("street");


        personDetails2.setAddresses(Arrays.asList(adres3));

        user2.setPersonDetails(personDetails2);


        // 3ci uzytkownik
        User user3 = new User();
        user3.setName("userXYZZZZZ");
        user3.setPassword("passwordXYZZZZZZ");

        Person personDetails3 = new Person();
        personDetails3.setAge(30);
        personDetails3.setName("Arkadiusz");
        personDetails3.setSurname("Sowiński");

        Permission uprawnienie4 = new Permission();
        uprawnienie4.setName("budowlaniec");

        List <Permission> uprawnienia3 = Arrays.asList(uprawnienie4);
        Role rola3 = new Role();
        rola3.setName("innarola3");
        rola3.setPermissions(uprawnienia);

        personDetails3.setRole(rola3);
        personDetails3.setPhoneNumbers(Arrays.asList("9999", "5555", "4444"));

        Address adres4 = new Address();
        adres4.setCity("Gdansk");
        adres4.setCountry("Poland");
        adres4.setFlatNumber(12);
        adres4.setHouseNumber(32);
        adres4.setPostCode("80-807");
        adres4.setStreetName("Politechniczna");


        personDetails3.setAddresses(Arrays.asList(adres4));

        user3.setPersonDetails(personDetails3);


        // 4ty uzytkownik
        User user4 = new User();
        user4.setName("userCztery");
        user4.setPassword("password444444");

        Person personDetails4 = new Person();
        personDetails4.setAge(40);
        personDetails4.setName("Amadeusz");
        personDetails4.setSurname("Mickiewicz");

        Permission uprawnienie5 = new Permission();
        uprawnienie5.setName("elektryk");

        List <Permission> uprawnienia5 = Arrays.asList(uprawnienie5);
        Role rola4 = new Role();
        rola4.setName("elektryk");
        rola4.setPermissions(uprawnienia);

        personDetails4.setRole(rola4);
        personDetails4.setPhoneNumbers(Arrays.asList("0000", "0101"));

        Address adres5 = new Address();
        adres5.setCity("Gdynia");
        adres5.setCountry("Poland");
        adres5.setFlatNumber(120);
        adres5.setHouseNumber(312);
        adres5.setPostCode("80-900");
        adres5.setStreetName("Marynarska");


        personDetails4.setAddresses(Arrays.asList(adres5));

        user4.setPersonDetails(personDetails4);


        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);


        //user który ma> 1 adres
        List <User> przefiltrowanaLista = UserService.findUsersWhoHaveMoreThanOneAddress(users);
        System.out.println("Użytkownicy, którzy mają więcej niż jeden adres: " + przefiltrowanaLista);


        //dane użytkownika ktory jest najstarszy
        Person findTheOldest = UserService.findOldestPerson(users);
        System.out.println("Dane najstarszego użytkownika: " + findTheOldest);


        //użytkownik o najdluzszej nazwie
        User findTheLongestName = UserService.findUserWithLongestUsername(users);
        System.out.println("Użytkownik o najdłuższej nazwie: " + findTheLongestName);


        //imiona i nazwiska userow +18
        String przefiltrowanaLista2 = UserService.getNamesAndSurnamesCommaSeparatedOfAllUsersAbove18(users);
        System.out.println("Imiona i nazwiska użytkowników +18: " + przefiltrowanaLista2);


        //posortowana A-Z lista uprawnień użytkowników z imieniem na A
        //List <String> przefiltrowanaLista3 = UserService.getSortedPermissionsOfUsersWithNameStartingWithA(users);
        //System.out.println("Posortowana lista uprawnień użytkowników o imionach na literę A : " + przefiltrowanaLista3);


        //uprawnienia użytkowników ktorych nazwisko zaczyna się na S
        //UserService userService = new UserService();
        //printCapitalizedPermissionNamesOfUsersWithSurnameStartingWithS(users);


        //mapa z rola i lista uzytkownikow
        System.out.println("Rola i lista użytkowników: " + UserService.groupUsersByRole(users));


        //mapa boolean
        System.out.println("Mapa: " + UserService.partitionUserByUnderAndOver18(users));

    }
}
