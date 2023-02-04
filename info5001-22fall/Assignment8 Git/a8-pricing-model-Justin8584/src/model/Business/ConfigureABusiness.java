/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  // Company Names
  private static final String[] cName = new String[] { "Samsung", "Apple", "Microsoft", "Google", "Sony", "Tencent",
      "Nokia", "Valve", "Nvidia", "AMD", "BlackBerry", "Xiaomi", "MeiZu", "OPPO", "OnePlus", "Baidu",
      "TSML", "TCL", "LG", "Lego", "Meta", "Uber", "Linkedln", "Bestbuy", "Nike", "Intel",
      "BMW", "Mecedes", "Audi", "Tesla" };

  // Samsung Products Name & floor,celing,target Price
  private static final String[] samsungPName = new String[] { "S20", "S19", "S18", "S17", "S16", "S15", "S14", "S13",
      "S12", "S11", "S10", "S9", "S8", "S7", "S6", "S5", "S4", "S3", "S2", "S1" };
  private static final int[][] samsungPPrice = new int[][] { { 2000, 2200, 2100 }, { 1900, 2100, 2000 },
      { 1800, 2000, 1900 }, { 1700, 1900, 1800 }, { 1600, 1800, 1700 }, { 1500, 1700, 1600 }, { 1400, 1600, 1500 },
      { 1300, 1500, 1400 }, { 1200, 1400, 1300 }, { 1100, 1300, 1200 }, { 1000, 1200, 1100 }, { 900, 1100, 1000 },
      { 800, 1000, 900 }, { 700, 900, 800 }, { 600, 800, 700 }, { 500, 700, 600 }, { 400, 600, 500 }, { 300, 500, 400 },
      { 200, 400, 300 }, { 100, 300, 200 } };

  // Apple Products Name & floor,celing,target Price
  private static final String[] applePName = new String[] { "iPhone20", "iPhone19", "iPhone18", "iPhone17", "iPhone16",
      "iPhone15", "iPhone14", "iPhone13", "iPhone12", "iPhone11", "iPhone10", "iPhone9", "iPhone8", "iPhone7",
      "iPhone6", "iPhone5", "iPhone4", "iPhone3", "iPhone2", "iPhone1" };
  private static final int[][] applePPrice = new int[][] { { 903, 1377, 1047 }, { 977, 1361, 1104 },
      { 968, 1254, 1186 }, { 843, 1259, 1161 }, { 906, 1256, 1188 }, { 916, 1388, 1010 }, { 964, 1327, 1091 },
      { 888, 1121, 1110 }, { 977, 1349, 1116 }, { 860, 1207, 1041 }, { 844, 1293, 1092 }, { 811, 1365, 1003 },
      { 912, 1213, 1124 }, { 854, 1357, 1134 }, { 910, 1286, 1166 }, { 819, 1228, 1012 }, { 852, 1358, 1106 },
      { 929, 1352, 1113 }, { 908, 1281, 1052 }, { 882, 1207, 1121 } };

  // Google Products Name & floor,celing,target Price
  private static final String[] googlePName = new String[] { "Pixel20", "Pixel19", "Pixel18", "Pixel17", "Pixel16",
      "Pixel15", "Pixel14", "Pixel13", "Pixel12", "Pixel11", "Pixel10", "Pixel9", "Pixel8", "Pixel7", "Pixel6",
      "Pixel5", "Pixel4", "Pixel3", "Pixel2", "Pixel1" };
  private static final int[][] googlePPrice = new int[][] { { 801, 1210, 1012 }, { 804, 1218, 1019 },
      { 806, 1240, 1025 }, { 814, 1251, 1043 }, { 821, 1252, 1048 }, { 868, 1258, 1062 }, { 871, 1271, 1067 },
      { 872, 1298, 1073 }, { 874, 1299, 1074 }, { 893, 1329, 1076 }, { 897, 1336, 1088 }, { 907, 1343, 1093 },
      { 914, 1358, 1095 }, { 928, 1359, 1096 }, { 931, 1376, 1109 }, { 935, 1380, 1116 }, { 949, 1387, 1119 },
      { 957, 1392, 1123 }, { 975, 1394, 1132 }, { 986, 1399, 1178 } };

  // Nvidia Products Name & floor,celing,target Price
  private static final String[] nvidiaPName = new String[] { "GeForce20", "GeForce19", "GeForce18", "GeForce17",
      "GeForce16", "GeForce15", "GeForce14", "GeForce13", "GeForce12", "GeForce11", "GeForce10", "GeForce9", "GeForce8",
      "GeForce7", "GeForce6", "GeForce5", "GeForce4", "GeForce3", "GeForce2", "GeForce1" };
  private static final int[][] nvidiaPPrice = new int[][] { { 1804, 2205, 2010 }, { 1839, 2226, 2019 },
      { 1844, 2237, 2023 }, { 1849, 2240, 2063 }, { 1853, 2243, 2066 }, { 1855, 2256, 2078 }, { 1866, 2259, 2092 },
      { 1871, 2276, 2093 }, { 1876, 2292, 2102 }, { 1878, 2295, 2122 }, { 1879, 2296, 2129 }, { 1888, 2335, 2134 },
      { 1893, 2336, 2139 }, { 1896, 2340, 2144 }, { 1899, 2348, 2153 }, { 1911, 2353, 2155 }, { 1934, 2356, 2170 },
      { 1950, 2361, 2171 }, { 1979, 2373, 2172 }, { 1990, 2386, 2187 } };

  // Sony Products Name & floor,celing,target Price
  private static final String[] sonyPName = new String[] { "Alpha20", "Alpha19", "Alpha18", "Alpha17", "Alpha16",
      "Alpha15", "Alpha14", "Alpha13", "Alpha12", "Alpha11", "Alpha10", "Alpha9", "Alpha8", "Alpha7", "Alpha6",
      "Alpha5", "Alpha4", "Alpha3", "Alpha2", "Alpha1" };
  private static final int[][] sonyPPrice = new int[][] { { 656, 1057, 872 }, { 660, 1060, 880 }, { 674, 1063, 904 },
      { 676, 1066, 905 }, { 680, 1082, 913 }, { 685, 1088, 916 }, { 700, 1109, 917 }, { 710, 1118, 920 },
      { 711, 1141, 923 }, { 714, 1148, 932 }, { 725, 1190, 939 }, { 738, 1200, 947 }, { 754, 1207, 960 },
      { 762, 1217, 1007 }, { 763, 1222, 1013 }, { 775, 1223, 1018 }, { 777, 1225, 1026 }, { 778, 1232, 1031 },
      { 826, 1246, 1038 }, { 828, 1248, 1044 }
  };

  private static final String[] customerID = new String[] { "Kayla Walker", "Roxanne Jackson", "Alfie Dinwiddie",
      "Rolf Shorts", "Jeff Rice", "Wilbur Annable", "Alex Colon", "Gerry Schwartz", "Eugene Valdez",
      "Christian Middleton", "Ronald Simonds", "Christopher Ball", "John Ogley", "Terry Lambert", "Cade Burrows",
      "Clarissa Madron", "Echo Flowers", "Addison Ward", "Patricia Hurlbutt", "Laurence Burrows", "Callie Hurlbutt",
      "Morton Pena", "Brooke Hewitt", "Bennett Bell", "Warren Thornton", "Jerry Barber", "Gabrielle Tucker",
      "Chelsea Morton", "Tara Manning", "Del Cohen" };

  // private static final String[] kaylaOrder1 = new String[] {"S20","iPhone20"};
  // private static final int[][] kaylaOrder1Price = new int[][] {{2092,1},{ 1047,
  // 1}};

  public static Business initialize(String name) {
    Business business = new Business(name);

    SupplierDirectory sd = business.getSupplierDirectory();
    for (String cn : cName) {
      Supplier tmp = sd.newSupplier(cn);
    }

    Supplier ssName = sd.findSupplier("Samsung");
    ProductCatalog ssProductCatalog = ssName.getProductCatalog();
    for (int i = 0; i < 20; i++) {
      ssProductCatalog.newProduct(samsungPName[i], samsungPPrice[i][0], samsungPPrice[i][1], samsungPPrice[i][2]);
    }

    Supplier appleName = sd.findSupplier("Apple");
    ProductCatalog appleProductCatalog = appleName.getProductCatalog();
    for (int i = 0; i < 20; i++) {
      appleProductCatalog.newProduct(applePName[i], applePPrice[i][0], applePPrice[i][1], applePPrice[i][2]);
    }

    Supplier googleName = sd.findSupplier("Google");
    ProductCatalog googleProductCatalog = googleName.getProductCatalog();
    for (int i = 0; i < 20; i++) {
      googleProductCatalog.newProduct(googlePName[i], googlePPrice[i][0], googlePPrice[i][1], googlePPrice[i][2]);
    }

    Supplier nvidiaName = sd.findSupplier("Nvidia");
    ProductCatalog nvidiaProductCatalog = nvidiaName.getProductCatalog();
    for (int i = 0; i < 20; i++) {
      nvidiaProductCatalog.newProduct(nvidiaPName[i], nvidiaPPrice[i][0], nvidiaPPrice[i][1], nvidiaPPrice[i][2]);
    }

    Supplier sonyName = sd.findSupplier("Sony");
    ProductCatalog sonyProductCatalog = sonyName.getProductCatalog();
    for (int i = 0; i < 20; i++) {
      sonyProductCatalog.newProduct(sonyPName[i], sonyPPrice[i][0], sonyPPrice[i][1], sonyPPrice[i][2]);
    }

    CustomerDirectory cd = business.getCustomerDirectory();
    for (String cuNm : customerID) {
      CustomerProfile tmp = cd.newCustomerProfile(new Person(cuNm));
    }

    MasterOrderList mol = business.getMasterOrderList();

    /* 1 Kayla Walker */
    CustomerProfile kaylaW = cd.findCustomer("Kayla Walker");
    Order kaylaWOrder1 = mol.newOrder(kaylaW);
    kaylaWOrder1.newOrderItem(ssProductCatalog.findProduct("S20"), 700, 2);
    kaylaWOrder1.newOrderItem(appleProductCatalog.findProduct("iPhone20"), 1047, 1);

    Order kaylaWOrder2 = mol.newOrder(kaylaW);
    kaylaWOrder2.newOrderItem(googleProductCatalog.findProduct("Pixel1"), 1178, 5);

    /* 2 Alfie Dinwiddie */
    CustomerProfile alfieD = cd.findCustomer("Alfie Dinwiddie");
    Order alfieDOrder1 = mol.newOrder(alfieD);
    alfieDOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha20"), 872, 1);

    Order alfieDOrder2 = mol.newOrder(alfieD);
    alfieDOrder2.newOrderItem(appleProductCatalog.findProduct("iPhone10"), 1041, 1);

    /* 3 Ronald Simonds */
    CustomerProfile ronaldS = cd.findCustomer("Ronald Simonds");
    Order ronaldSOrder1 = mol.newOrder(ronaldS);
    ronaldSOrder1.newOrderItem(ssProductCatalog.findProduct("S20"), 700, 1);

    Order ronaldSOrder2 = mol.newOrder(ronaldS);
    ronaldSOrder2.newOrderItem(ssProductCatalog.findProduct("S20"), 700, 1);

    /* 4 Rolf Shorts */
    CustomerProfile rolfS = cd.findCustomer("Rolf Shorts");
    Order rolfSOrder1 = mol.newOrder(rolfS);
    rolfSOrder1.newOrderItem(ssProductCatalog.findProduct("S20"), 700, 1);
    rolfSOrder1.newOrderItem(nvidiaProductCatalog.findProduct("GeForce20"), 2010, 1);
    rolfSOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha1"), 1040, 1);

    /* 5 Jeff Rice */
    CustomerProfile jeffR = cd.findCustomer("Jeff Rice");
    Order jeffROrder1 = mol.newOrder(jeffR);
    jeffROrder1.newOrderItem(ssProductCatalog.findProduct("S20"), 700, 5);

    Order jeffROrder2 = mol.newOrder(jeffR);
    jeffROrder2.newOrderItem(nvidiaProductCatalog.findProduct("GeForce1"), 2187, 2);

    /* 6 Wilbur Annable */
    CustomerProfile wilburA = cd.findCustomer("Wilbur Annable");
    Order wilburAOrder1 = mol.newOrder(wilburA);
    wilburAOrder1.newOrderItem(appleProductCatalog.findProduct("iPhone19"), 1104, 3);
    wilburAOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha20"), 872, 1);

    /* 7 Alex Colon */
    CustomerProfile alexC = cd.findCustomer("Alex Colon");
    Order alexCOrder1 = mol.newOrder(alexC);
    alexCOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha2"), 1038, 7);

    /* 8 Gerry Schwartz */
    CustomerProfile gerryS = cd.findCustomer("Gerry Schwartz");
    Order gerrySOrder1 = mol.newOrder(gerryS);
    gerrySOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha3"), 1031, 1);

    Order gerrySOrder2 = mol.newOrder(gerryS);
    gerrySOrder2.newOrderItem(sonyProductCatalog.findProduct("Alpha4"), 1026, 1);

    /* 9 Christian Middleton */
    CustomerProfile christianM = cd.findCustomer("Christian Middleton");
    Order christianMOrder1 = mol.newOrder(christianM);
    christianMOrder1.newOrderItem(googleProductCatalog.findProduct("Pixel5"), 1116, 5);

    Order christianMOrder2 = mol.newOrder(christianM);
    christianMOrder2.newOrderItem(googleProductCatalog.findProduct("Pixel6"), 1109, 5);

    Order christianMOrder3 = mol.newOrder(christianM);
    christianMOrder3.newOrderItem(googleProductCatalog.findProduct("Pixel7"), 1096, 5);

    /* 10 Christopher Ball */
    CustomerProfile christopherB = cd.findCustomer("Christopher Ball");
    Order christopherBOrder1 = mol.newOrder(christopherB);
    christopherBOrder1.newOrderItem(googleProductCatalog.findProduct("Pixel19"), 1019, 10);
    christopherBOrder1.newOrderItem(sonyProductCatalog.findProduct("Alpha20"), 872, 1);

    Order christopherBOrder2 = mol.newOrder(christopherB);
    christopherBOrder2.newOrderItem(appleProductCatalog.findProduct("iPhone20"), 1047, 1);

    Order christopherBOrder3 = mol.newOrder(christopherB);
    christopherBOrder3.newOrderItem(googleProductCatalog.findProduct("Pixel2"), 1132, 4);

    return business;
  }
}
