package mnl.senn.proje.bootstrap;


import mnl.senn.proje.model.*;
import mnl.senn.proje.service.abstractt.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class bootStrapData implements CommandLineRunner {

    private final CategoryService categoryService;
    private final CustomerService customerService;
    private final SaleService saleService;
    private final StockCardService stockCardService;
    private final UserService userService;

    public bootStrapData(CategoryService categoryService, CustomerService customerService, SaleService saleService,
                         StockCardService stockCardService, UserService userService) {
        this.categoryService = categoryService;

        this.customerService = customerService;

        this.saleService = saleService;

        this.stockCardService = stockCardService;

        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {


        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();

        User admin = new User();
        admin.setPassword("123456");
        admin.setEmail("minelsen@gmail.com");
        userService.save(admin);


        Category category0 = new Category();
        category0.setCategoryName("CHARM");
        categoryService.save(category0);

        Category category1 = new Category();
        category1.setCategoryName("YÜZÜK");
        categoryService.save(category1);


        Category category2 = new Category();
        category2.setCategoryName("BİLEKLİK");
        categoryService.save(category2);

        Category category3 = new Category();
        category3.setCategoryName("KOLYE");
        categoryService.save(category3);


        Category category4 = new Category();
        category4.setCategoryName("KÜPE");
        categoryService.save(category4);


        StockCard stock0 = new StockCard();
        stock0.setDescription("4k rose altın kaplama , mat yüzeyli buzlu pembe bir Murano cama sahip.");
        stock0.setProductName("Mat Pembe Murano Cam Charm");
        stock0.setStockCode(10);
        stock0.setPieces(10);
        stock0.setTotelPrice(2000.00);
        stock0.setCategory(category0);
        stockCardService.save(stock0);

        StockCard stock1 = new StockCard();
        stock1.setDescription("Disney’in oyuncak tasarımcılarıyla birlikte tasarlanan bu parça 925 ayar gümüş vemavi mineyle süsleniyor");
        stock1.setProductName("Disney Lady Charm");
        stock1.setStockCode(11);
        stock1.setPieces(10);
        stock1.setTotelPrice(3000.00);
        stock1.setCategory(category0);
        stockCardService.save(stock1);

        StockCard stock2 = new StockCard();
        stock2.setDescription("Mavi mine detayları ve ‘Believe in the power of your dreams’ işlemesiyle 925 ayar gümüş charm");
        stock2.setProductName("Mavi Düş Kapanı Charm");
        stock2.setStockCode(12);
        stock2.setPieces(20);
        stock2.setTotelPrice(8000.00);
        stock2.setCategory(category0);
        stockCardService.save(stock2);

        StockCard stock3 = new StockCard();
        stock3.setDescription("Prenses Leia’nın yüzünün 3 boyutlu bir tasarımını taşırken dört adet gök mavisi kristal tasarımı çerçeveliyor.");
        stock3.setProductName("Star Wars Princess Leia Sallantılı Charm");
        stock3.setStockCode(13);
        stock3.setPieces(5);
        stock3.setTotelPrice(2500.00);
        stock3.setCategory(category0);
        stockCardService.save(stock3);

        StockCard stock4 = new StockCard();
        stock4.setDescription(" 925 ayar gümüş sallantılı charm ilham kaynağı olması için “Adventure is out there” cümlesini taşıyor.");
        stock4.setProductName("Disney Up-Ev ve Balonlar Charm'ı");
        stock4.setStockCode(14);
        stock4.setPieces(8);
        stock4.setTotelPrice(12000.00);
        stock4.setCategory(category0);
        stockCardService.save(stock4);

        StockCard stock5 = new StockCard();
        stock5.setDescription("14k rose altın kaplama parıltılı, pembe kristal taşlı yüzük ");
        stock5.setProductName("Pembe Işıltılı Taç Tektaş Yüzük");
        stock5.setPieces(10);
        stock5.setStockCode(20);
        stock5.setTotelPrice(7000.00);
        stock5.setCategory(category1);
        stockCardService.save(stock5);

        StockCard stock6 = new StockCard();
        stock6.setDescription("925 ayar gümüş yüzük, mücevhere doku katan boncuklarla kaplı bir dizi deniz kabuğuna sahip");
        stock6.setProductName("Boncuklu Deniz Kabuğu Bant Yüzük");
        stock6.setStockCode(21);
        stock6.setPieces(20);
        stock6.setTotelPrice(100000.00);
        stock6.setCategory(category1);
        stockCardService.save(stock6);

        StockCard stock7 = new StockCard();
        stock7.setDescription("925 ayar gümüş, kübik zirkon yüzük");
        stock7.setProductName("Vintage Etkisi Yüzüğü");
        stock7.setStockCode(22);
        stock7.setPieces(10);
        stock7.setTotelPrice(8000.00);
        stock7.setCategory(category1);
        stockCardService.save(stock7);

        StockCard stock8 = new StockCard();
        stock8.setDescription("925 ayar gümüş, akasya figürlü, lades yüzük");
        stock8.setProductName("Gerçek Dilek Yüzüğü");
        stock8.setStockCode(23);
        stock8.setPieces(20);
        stock8.setTotelPrice(8000.00);
        stock8.setCategory(category1);
        stockCardService.save(stock8);

        StockCard stock9 = new StockCard();
        stock9.setDescription("ışıltılı şeffaf taşlar içeren saf gümüşten narin bir yüzük");
        stock9.setProductName("Gökyüzündeki Yıldız Yüzüğü");
        stock9.setStockCode(24);
        stock9.setPieces(20);
        stock9.setTotelPrice(6000.00);
        stock9.setCategory(category1);
        stockCardService.save(stock9);

        StockCard stock10 = new StockCard();
        stock10.setDescription(" Deniz kabuğu 925 ayar gümüşten üretilmiş");
        stock10.setProductName("Pandora Moments Deniz Kabuğu Klipsli Turkuaz Örgü Deri Bileklik");
        stock10.setStockCode(30);
        stock10.setPieces(15);
        stock10.setTotelPrice(900.0);
        stock10.setCategory(category2);
        stockCardService.save(stock10);

        StockCard stock11 = new StockCard();
        stock11.setDescription("Yarısı kare, yarısı yuvarlak uçlara sahip olan 925 ayar gümüş bileklik");
        stock11.setProductName("Pandora Signature I-D Bileklik");
        stock11.setStockCode(31);
        stock11.setPieces(5);
        stock11.setTotelPrice(10000.0);
        stock11.setCategory(category2);
        stockCardService.save(stock11);

        StockCard stock12 = new StockCard();
        stock12.setDescription("üç ince yılan zinciri ile ikonik Pandora logosunu ve monogramını içeren 14k rose altın kaplama bileklik");
        stock12.setProductName("Pandora Moments Çoklu Zincir Bileklik");
        stock12.setStockCode(32);
        stock12.setPieces(8);
        stock12.setTotelPrice(13000.0);
        stock12.setCategory(category2);
        stockCardService.save(stock12);

        StockCard stock13 = new StockCard();
        stock13.setDescription("Yukarı aşağı hareket eden oluklu kanatlara sahiptir ve “I open at the close” mesajını içerir");
        stock13.setProductName("Pandora Moments Harry Potter, Golden Snitch Klipsli Bileklik");
        stock13.setStockCode(33);
        stock13.setPieces(5);
        stock13.setTotelPrice(500.0);
        stock13.setCategory(category2);
        stockCardService.save(stock13);

        StockCard stock14 = new StockCard();
        stock14.setDescription("Işıltılı mavi ve şeffaf kübik zirkon içeren saf gümüşten kayan bileklik");
        stock14.setProductName("Mavi ve Şeffaf Işıltı Kayan Bileklik");
        stock14.setStockCode(34);
        stock14.setPieces(6);
        stock14.setTotelPrice(3000.0);
        stock14.setCategory(category2);
        stockCardService.save(stock14);

        StockCard stock15 = new StockCard();
        stock15.setDescription("925 ayar gümüşten,bağlantı zincir kolye");
        stock15.setProductName("Halkalı Zincir Kolye");
        stock15.setStockCode(40);
        stock15.setPieces(15);
        stock15.setTotelPrice(9000.0);
        stock15.setCategory(category3);
        stockCardService.save(stock15);

        StockCard stock16 = new StockCard();
        stock16.setDescription(" 925 ayar gümüş örgüden üretilen kolye");
        stock16.setProductName("Pandora Reflexions Örgü Choker Kolye");
        stock16.setStockCode(41);
        stock16.setPieces(10);
        stock16.setTotelPrice(5000.0);
        stock16.setCategory(category3);
        stockCardService.save(stock16);


        StockCard stock17 = new StockCard();
        stock17.setDescription("Kolye, şeffaf kübik zirkonlarla süslenmiş 925 ayar gümüş kolye");
        stock17.setProductName("Işıltılı Kar Tanesi Kolye");
        stock17.setStockCode(42);
        stock17.setPieces(10);
        stock17.setTotelPrice(2000.0);
        stock17.setCategory(category3);
        stockCardService.save(stock17);

        StockCard stock18 = new StockCard();
        stock18.setDescription("Şeffaf kübik zirkonlarla çevrili bir mavi taş içeriyor ve tekerlekleri sarmal şekilli yaprak detaylarıyla süslendi. ");
        stock18.setProductName("Disney Sindirella Bal Kabağı Arabası");
        stock18.setStockCode(43);
        stock18.setPieces(5);
        stock18.setTotelPrice(3500.0);
        stock18.setCategory(category3);
        stockCardService.save(stock18);

        StockCard stock19 = new StockCard();
        stock19.setDescription("925 ayar gümüş çiçek yaprakları ve arkasında parlak kalp şeklinde detaylar bulunuyor.");
        stock19.setProductName("Pave Papatya Kolye");
        stock19.setStockCode(44);
        stock19.setPieces(10);
        stock19.setTotelPrice(6250.0);
        stock19.setCategory(category3);
        stockCardService.save(stock19);

        StockCard stock20 = new StockCard();
        stock20.setDescription("925 ayar gümüş boncuk döngülü küpe");
        stock20.setProductName("Boncuk Süsleme Yuvarlak Çivi Küpeler");
        stock20.setStockCode(50);
        stock20.setPieces(15);
        stock20.setTotelPrice(1500.0);
        stock20.setCategory(category4);
        stockCardService.save(stock20);

        StockCard stock21 = new StockCard();
        stock21.setDescription("14k rose altın kaplamalı, minimalist Asimetrik Kalpli Halka Küpeler");
        stock21.setProductName("Asimetrik Kalpli Halka Küpeler");
        stock21.setStockCode(51);
        stock21.setPieces(5);
        stock21.setTotelPrice(1000.0);
        stock21.setCategory(category4);
        stockCardService.save(stock21);

        StockCard stock22 = new StockCard();
        stock22.setDescription("Parıltılı Gözyaşları Çivi");
        stock22.setProductName("Parıltılı Gözyaşları Çivi");
        stock22.setStockCode(52);
        stock22.setPieces(20);
        stock22.setTotelPrice(5000.0);
        stock22.setCategory(category4);
        stockCardService.save(stock22);

        StockCard stock23 = new StockCard();
        stock23.setDescription("14k rose altın kaplama küpelerin ortasında pavé dizim kübik zirkon ve Pandora logosu bulunuyor.");
        stock23.setProductName("Işıltılı Pandora Logolu İğne Küpeler");
        stock23.setStockCode(53);
        stock23.setPieces(10);
        stock23.setTotelPrice(5000.0);
        stock23.setCategory(category4);
        stockCardService.save(stock23);

        StockCard stock24 = new StockCard();
        stock24.setDescription("925 ayar gümüş, kübik zirkon");
        stock24.setProductName("Yıldız Küpeler");
        stock24.setStockCode(54);
        stock24.setPieces(10);
        stock24.setTotelPrice(1000.0);
        stock24.setCategory(category4);
        stockCardService.save(stock24);


        Customer customer0 = new Customer();
        customer0.setCustomerName("İstanbul Pandora Şubesi");
        customer0.setEmail("pandora_istanbul@gmail.com");
        customer0.setPassword("34");
        customer0.setUser(admin);
        customerService.save(customer0);

        Customer customer1 = new Customer();
        customer1.setCustomerName("Ankara Pandora Şubesi");
        customer1.setEmail("pandora_ankara@gmail.com");
        customer1.setPassword("06");
        customer1.setUser(admin);
        customerService.save(customer1);

        Customer customer2 = new Customer();
        customer2.setCustomerName("İzmir Pandora Şubesi");
        customer2.setEmail("pandora_izmir@gmail.com");
        customer2.setPassword("35");
        customer2.setUser(admin);
        customerService.save(customer2);

        Customer customer3 = new Customer();
        customer3.setCustomerName("Tekirdağ Pandora Şubesi");
        customer3.setEmail("pandora_tekirdag@gmail.com");
        customer3.setPassword("34");
        customer3.setUser(admin);
        customerService.save(customer3);

        Customer customer4 = new Customer();
        customer4.setCustomerName("Bursa Pandora Şubesi");
        customer4.setEmail("pandora_bursa@gmail.com");
        customer4.setPassword("16");
        customer4.setUser(admin);
        customerService.save(customer4);


        Sale sale0 = new Sale();
        sale0.setSaleTime(formatter.format(date));
        sale0.setCustomer(customer0);
        sale0.setStockCard(stock0);
        sale0.setCategory(category0);
        saleService.save(sale0);

        Sale sale1 = new Sale();
        sale1.setSaleTime(formatter.format(date));
        sale1.setCustomer(customer2);
        sale1.setStockCard(stock5);
        sale1.setCategory(category1);
        saleService.save(sale1);


        Sale sale2 = new Sale();
        sale2.setSaleTime(formatter.format(date));
        sale2.setCustomer(customer3);
        sale2.setStockCard(stock19);
        sale2.setCategory(category3);
        saleService.save(sale2);


        Sale sale3 = new Sale();
        sale3.setSaleTime(formatter.format(date));
        sale3.setCustomer(customer2);
        sale3.setStockCard(stock24);
        sale3.setCategory(category4);
        saleService.save(sale3);


        Sale sale4 = new Sale();
        sale4.setSaleTime(formatter.format(date));
        sale4.setCustomer(customer3);
        sale4.setStockCard(stock11);
        sale4.setCategory(category2);
        saleService.save(sale4);


        Sale sale5 = new Sale();
        sale5.setSaleTime(formatter.format(date));
        sale5.setCustomer(customer4);
        sale5.setStockCard(stock9);
        sale5.setCategory(category1);
        saleService.save(sale5);

        Sale sale6 = new Sale();
        sale6.setSaleTime(formatter.format(date));
        sale6.setCustomer(customer2);
        sale6.setStockCard(stock1);
        sale6.setCategory(category0);
        saleService.save(sale6);
    }

}
