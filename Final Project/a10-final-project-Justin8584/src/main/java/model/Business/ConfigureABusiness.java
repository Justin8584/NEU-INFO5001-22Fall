/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.ArrayList;

import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketModel.MarketCatalog;
import model.MarketModel.MarketChannelAssignment;
import model.MarketModel.MarketChannelComboCatalog;
import model.MarketModel.Channel;
import model.MarketModel.ChannelCatalog;
import model.MarketModel.Market;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Advertise;
import model.ProductManagement.AdvertiseCatalog;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.SolutionOffer;
import model.ProductManagement.SolutionOfferCatalog;
import model.SolutionOrders.MasterSolutionOrderList;
import model.SolutionOrders.SolutionOrder;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

	public static Business initialize(String name) {
		Business business = new Business(name);

		// create SupplierDirectory
		SupplierDirectory sd = business.getSupplierDirectory();
		// supplier Samsung
		Supplier samsung = sd.newSupplier("Samsung");
		ProductCatalog ssPrdtCtlog = samsung.getProductCatalog();
		Product s22Phone = ssPrdtCtlog.newProduct("S22-Phone", 2000, 2200, 2100);
		Product X21Tablet = ssPrdtCtlog.newProduct("X21-Tablet", 1800, 2000, 1900);
		Product Z9Laptop = ssPrdtCtlog.newProduct("Z9-Laptop", 2300, 2500, 2400);
		Product ssFix = ssPrdtCtlog.newProduct("SamSungFix", 500, 700, 600);
		// supplier Apple
		Supplier apple = sd.newSupplier("Apple");
		ProductCatalog applePrdtCtlog = apple.getProductCatalog();
		Product iPhone20 = applePrdtCtlog.newProduct("iPhone20", 2300, 2500, 2400);
		Product iPad15 = applePrdtCtlog.newProduct("iPad15", 2000, 2200, 2100);
		Product iMacBook = applePrdtCtlog.newProduct("iMacBook", 2500, 2700, 2600);
		Product appleCare = applePrdtCtlog.newProduct("AppleCare", 700, 900, 800);
		// supplier Microsoft
		Supplier microsoft = sd.newSupplier("Microsoft");
		ProductCatalog microPrdtCtlog = microsoft.getProductCatalog();
		Product lumia735 = microPrdtCtlog.newProduct("Lumia735", 900, 1100, 1000);
		Product surfaceGo = microPrdtCtlog.newProduct("SurfaceGo", 1500, 1700, 1600);
		Product surfacePro = microPrdtCtlog.newProduct("SurfacePro", 1700, 1900, 1800);
		Product MicroRepair = microPrdtCtlog.newProduct("MicroRepair", 400, 600, 500);

		// market data
		MarketCatalog mc = business.getMarketCatalog();
		Market collegeStudentMarket = mc.newMarket("College-Student"); // student
		Market businessOfficerMarket = mc.newMarket("Business-Officer"); // white-collar
		Market constructWorkerMarket = mc.newMarket("Construct-Worker"); // blue-collar

		// channel data
		ChannelCatalog chanCalog = business.getChannelCatalog();
		Channel YTBChannel = chanCalog.newChannel("YouTube"); // YouTube
		Channel emailChannel = chanCalog.newChannel("Email"); // Email
		Channel smsChannel = chanCalog.newChannel("SMS"); // SMS Message

		collegeStudentMarket.addValidChannels(YTBChannel);
		businessOfficerMarket.addValidChannels(emailChannel);
		constructWorkerMarket.addValidChannels(smsChannel);

		// add channels to markets
		MarketChannelComboCatalog marChlCmbCatalog = business.getMarketChannelComboCatalog();

		MarketChannelAssignment collStuYTBMCCmb = marChlCmbCatalog.newMarketChannelAssign(
				"CollegeStudent-Youtube",
				collegeStudentMarket, YTBChannel);

		MarketChannelAssignment busOffEmailMCCmb = marChlCmbCatalog.newMarketChannelAssign(
				"BusinessOfficer-Email",
				businessOfficerMarket, emailChannel);

		MarketChannelAssignment consWorkSmsMCCmb = marChlCmbCatalog.newMarketChannelAssign(
				"ConstructWorker-SMS",
				constructWorkerMarket, smsChannel);

		// Advertises
		AdvertiseCatalog advertises = business.getAdvertises();
		Advertise collStuAD = advertises.newAdvertise("College Student Ads",
				"\nHi Student, welcome to your new semester! Please check out our best students deals, including Table and Laptop in those Bundles. Makes your study easier.",
				collStuYTBMCCmb);
		Advertise busOffAD = advertises.newAdvertise("Business Officer Ads",
				"\nHi Officer, Please check out our best deals for business. Phone and laptop bundles would make work efficient everywhere.",
				busOffEmailMCCmb);
		Advertise conWokAD = advertises.newAdvertise("Construct Worker Ads",
				"\nHi Worker, Safety is important, your electrics as well. Please check out our best Phones and unlimited repairs. Fresh Phone for everyday.",
				consWorkSmsMCCmb);

		// Solution Offers Catalog
		SolutionOfferCatalog solutionOfferCatalog = business.getSolutionOfferCatalog();

		// College Student bundle and price (Table + Laptop)
		SolutionOffer sofCollStuYTB1 = solutionOfferCatalog.newSolutionOffer(collStuYTBMCCmb);
		sofCollStuYTB1.addProduct(iPad15);
		sofCollStuYTB1.addProduct(iMacBook);
		sofCollStuYTB1.setPromotionPrice(iPad15.getFloorPrice() + iMacBook.getFloorPrice());
		sofCollStuYTB1.addAds(collStuAD);

		SolutionOffer sofCollStuYTB2 = solutionOfferCatalog.newSolutionOffer(collStuYTBMCCmb);
		sofCollStuYTB2.addProduct(X21Tablet);
		sofCollStuYTB2.addProduct(Z9Laptop);
		sofCollStuYTB2.setPromotionPrice(X21Tablet.getFloorPrice() + Z9Laptop.getFloorPrice());
		sofCollStuYTB2.addAds(collStuAD);

		SolutionOffer sofCollStuYTB3 = solutionOfferCatalog.newSolutionOffer(collStuYTBMCCmb);
		sofCollStuYTB3.addProduct(surfaceGo);
		sofCollStuYTB3.addProduct(surfacePro);
		sofCollStuYTB3.setPromotionPrice(surfaceGo.getFloorPrice() + surfacePro.getFloorPrice());
		sofCollStuYTB3.addAds(collStuAD);

		// Business Officers bundle and price (Phone + Laptop)
		SolutionOffer sofBusOffEmail1 = solutionOfferCatalog.newSolutionOffer(busOffEmailMCCmb);
		sofBusOffEmail1.addProduct(iPhone20);
		sofBusOffEmail1.addProduct(iMacBook);
		sofBusOffEmail1.setPromotionPrice(iPhone20.getFloorPrice() + iMacBook.getFloorPrice());
		sofBusOffEmail1.addAds(busOffAD);

		SolutionOffer sofBusOffEmail2 = solutionOfferCatalog.newSolutionOffer(busOffEmailMCCmb);
		sofBusOffEmail2.addProduct(s22Phone);
		sofBusOffEmail2.addProduct(Z9Laptop);
		sofBusOffEmail2.setPromotionPrice(s22Phone.getFloorPrice() + Z9Laptop.getFloorPrice());
		sofBusOffEmail2.addAds(busOffAD);

		SolutionOffer sofBusOffEmail3 = solutionOfferCatalog.newSolutionOffer(busOffEmailMCCmb);
		sofBusOffEmail3.addProduct(lumia735);
		sofBusOffEmail3.addProduct(surfacePro);
		sofBusOffEmail3.setPromotionPrice(lumia735.getFloorPrice() + surfacePro.getFloorPrice());
		sofBusOffEmail3.addAds(busOffAD);

		// Construct Worker bundle and price (Phone + Fix)
		SolutionOffer sofConsWorkSMS1 = solutionOfferCatalog.newSolutionOffer(consWorkSmsMCCmb);
		sofConsWorkSMS1.addProduct(iPhone20);
		sofConsWorkSMS1.addProduct(appleCare);
		sofConsWorkSMS1.setPromotionPrice(iPhone20.getFloorPrice() + appleCare.getFloorPrice());
		sofConsWorkSMS1.addAds(conWokAD);

		SolutionOffer sofConsWorkSMS2 = solutionOfferCatalog.newSolutionOffer(consWorkSmsMCCmb);
		sofConsWorkSMS2.addProduct(s22Phone);
		sofConsWorkSMS2.addProduct(ssFix);
		sofConsWorkSMS2.setPromotionPrice(s22Phone.getFloorPrice() + ssFix.getFloorPrice());
		sofConsWorkSMS2.addAds(conWokAD);

		SolutionOffer sofConsWorkSMS3 = solutionOfferCatalog.newSolutionOffer(consWorkSmsMCCmb);
		sofConsWorkSMS3.addProduct(lumia735);
		sofConsWorkSMS3.addProduct(MicroRepair);
		sofConsWorkSMS3.setPromotionPrice(lumia735.getFloorPrice() + MicroRepair.getFloorPrice());
		sofConsWorkSMS3.addAds(conWokAD);

		// create persons
		PersonDirectory perDire = business.getPersonDirectory();
		Person person1 = perDire.newPerson("Daenerys Targaryen");
		Person person2 = perDire.newPerson("John Snow");
		Person person3 = perDire.newPerson("Tyrion Lannister");
		Person person4 = perDire.newPerson("Margaery Tyrell");
		Person person5 = perDire.newPerson("Sansa Stark");

		// create customers
		CustomerDirectory cd = business.getCustomerDirectory();
		CustomerProfile daenerys = cd.newCustomerProfile(person1); // student
		CustomerProfile john = cd.newCustomerProfile(person2); // business officer
		CustomerProfile tyrion = cd.newCustomerProfile(person3); // construct worker
		CustomerProfile margaery = cd.newCustomerProfile(person4); // student
		CustomerProfile sansa = cd.newCustomerProfile(person5); // business officer

		// Master Solution Order List
		MasterSolutionOrderList msol = business.getMasterSolutionOrderList();
		// Solution Orders for three MktChlCombos, add to customer
		msol.newSolutionOrder(daenerys, sofCollStuYTB1, collStuYTBMCCmb);
		msol.newSolutionOrder(john, sofBusOffEmail2, busOffEmailMCCmb);
		msol.newSolutionOrder(tyrion, sofConsWorkSMS3, consWorkSmsMCCmb);
		msol.newSolutionOrder(margaery, sofCollStuYTB2, collStuYTBMCCmb);
		msol.newSolutionOrder(sansa, sofBusOffEmail1, busOffEmailMCCmb);

		// calculate revenues
		// by market
		int stuMktRev = msol.getRevenueByMarket(collegeStudentMarket);
		int offMktRev = msol.getRevenueByMarket(businessOfficerMarket);
		int wokMktRev = msol.getRevenueByMarket(constructWorkerMarket);

		// by channel
		int yTBChlRev = msol.getRevenueByChannel(YTBChannel);
		int emlChlRev = msol.getRevenueByChannel(emailChannel);
		int smsChlRev = msol.getRevenueByChannel(smsChannel);

		// by MktChlCombos
		int stuYTBCmbRev = msol.getRevenueByMarketChannelCombo(collStuYTBMCCmb);
		int offEmlCmbRev = msol.getRevenueByMarketChannelCombo(busOffEmailMCCmb);
		int wokSMSCmbRev = msol.getRevenueByMarketChannelCombo(consWorkSmsMCCmb);

		// print statements
		System.out.println(
				"\n Hi, There. Let's get know each other better!\n ***** Please talk a little bit more about your job: ");
		String userMkt = Business.getUserInput();
		System.out.println(" ****** Great! Please enter the channel where you see our message:");
		String userChl = Business.getUserInput();

		if (userMkt.equals("College-Student") && userChl.equals("YouTube")) {

			// advertises.printAdvertise(collStuYTBMCCmb);
			System.out.println(collStuAD.getContent());
			System.out.println("Here is all solution offers. Please Check them out!");

			ArrayList<SolutionOffer> foundSoFColStu = solutionOfferCatalog
					.findSolutionsForMarChlCombo(collStuYTBMCCmb);
			for (SolutionOffer sof : foundSoFColStu) {
				sof.printSolOffer();
				System.out.println("The Original $" + sof.getActualPrice() + ", and NOW Deals ==> $"
						+ sof.getPromotionPrice()
						+ ", which is $"
						+ (sof.getActualPrice() - sof.getPromotionPrice())
						+ " OFF !");
			}
			System.out.println("--------------------------------------------------------");

		} else if (userMkt.equals("Business-Officer") && userChl.equals("Email")) {

			// advertises.printAdvertise(busOffEmailMCCmb);
			System.out.println(busOffAD.getContent());
			System.out.println("Here is all solution offers. Please Check them out!");

			ArrayList<SolutionOffer> foundSoFBusOFF = solutionOfferCatalog
					.findSolutionsForMarChlCombo(busOffEmailMCCmb);
			for (SolutionOffer sof : foundSoFBusOFF) {
				sof.printSolOffer();
				System.out.println("The Original $" + sof.getActualPrice() + ", and NOW Deals ==> $"
						+ sof.getPromotionPrice()
						+ ", which is $"
						+ (sof.getActualPrice() - sof.getPromotionPrice())
						+ " OFF !");
			}
			System.out.println("--------------------------------------------------------");

		} else if (userMkt.equals("Construct-Worker") && userChl.equals("SMS")) {

			// advertises.printAdvertise(consWorkSmsMCCmb);
			System.out.println(conWokAD.getContent());
			System.out.println("Here is all solution offers. Please Check them out!");

			ArrayList<SolutionOffer> foundSoFConWok = solutionOfferCatalog
					.findSolutionsForMarChlCombo(consWorkSmsMCCmb);
			for (SolutionOffer sof : foundSoFConWok) {
				sof.printSolOffer();
				System.out.println("The Original $" + sof.getActualPrice() + ", and NOW Deals ==> $"
						+ sof.getPromotionPrice()
						+ ", which is $"
						+ (sof.getActualPrice() - sof.getPromotionPrice())
						+ " OFF !");
			}
			System.out.println("--------------------------------------------------------");

		} else {
			System.out.println("\nSry, We didn't recognize you. Please check out our product catalog.");
			business.printBusinessINFO();
			System.out.println("\nAlso, you can check out our all best deals in Solution Offer List.");
			business.printSolutionOffers();
		}

		// print Sales Results
		System.out.println("\n\n ######  Revenue Report ###### ");
		System.out.println("\n---- Revenue by Market ----");
		System.out.println("College Student Market Revenue: $" + stuMktRev);
		System.out.println("Business Officer Market Revenue: $" + offMktRev);
		System.out.println("Construct Worker Market Revenue: $" + wokMktRev);
		System.out.println("\n---- Revenue by Channel ----");
		System.out.println("YouTube Channel Revenue: $" + yTBChlRev);
		System.out.println("Email Channel Revenue: $" + emlChlRev);
		System.out.println("SMS-Message Channel Revenue: $" + smsChlRev);
		System.out.println("\n---- Revenue byu MarketChannel Combo ----");
		System.out.println("College-Student in YouTube Revenue: $" + stuYTBCmbRev);
		System.out.println("Business Officer in Email Revenue: $" + offEmlCmbRev);
		System.out.println("Construct Worker in SMS Revenue: $" + wokSMSCmbRev);

		System.out.println("\n The following is the Revenue Report in Comparative Table format: ");

		System.out.printf("-----------------------------------------------------------------------------%n");
		System.out.printf("|                      Market Channel Revenue Report $                      |%n");
		System.out.printf("-----------------------------------------------------------------------------%n");
		System.out.printf("| %-16s | %-16s | %-16s | %-16s |%n", "Market/Channel", "YouTube",
				"Email",
				"SMS Message");
		System.out.printf("-----------------------------------------------------------------------------%n");

		System.out.printf("| %-16s | %-16d | %-16d | %-16d |%n", "College Student", stuYTBCmbRev, 0, 0);
		System.out.printf("-----------------------------------------------------------------------------%n");
		System.out.printf("| %-16s | %-16d | %-16d | %-16d |%n", "Business Officer", 0, offEmlCmbRev, 0);
		System.out.printf("-----------------------------------------------------------------------------%n");
		System.out.printf("| %-16s | %-16d | %-16d | %-16d |%n", "Construct Worker", 0, 0, wokSMSCmbRev);
		System.out.printf("-----------------------------------------------------------------------------%n");

		return business;

	}
}
