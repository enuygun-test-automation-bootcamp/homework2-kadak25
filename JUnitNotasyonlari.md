JUnit Notasyonları Nelerdir ?
1.@BeforeClass
2.@AfterClass
3.@Before
4.@After
5.@Test
6.@Ignore 
olmak üzere altıya ayırabiliriz;
   
Bunlar haricinde Junit 5.8.1 ile birlikte

*@BeforeAll
*@BeforeEach
*@AfterEach
*@AfterAll
 gibi notasyonlar da eklenmiştir.

---@BeforeClass---

    Bütün testler başlamadan önce çalışacak metottur. Örneğin, veritabanı bağlantısı bu sınıfta gerçekleştirilir.

---@AfterClass---
    
    Bütün testler bittikten sonra çalışacak metottur. Yukarıda bahsetmiş olduğumuz veritabanı bağlantı işlemi 
    @BeforeClass notasyonu ile başlatılırken veritabanı bağlantısını sonlandırma işlemi ise burada gerçekleştirilmektedir.

---@Before---
    
    Before notasyonu da test adımlarından önce başlamaktadır. Veri okuması ve testin öncesinde yapılması gereken işlemler
    test adımlarını hızlandırmak için yani zamandan tasarruf etmek için bu metot da tanımlanır. Model ve nesnelerine atama 
    işlemlerinin burada gerçekleştiririz. Bir önceki dersimizde Before notasyonun içerisinde WebDriver tanımlarını ve model 
    atamalarını burada gerçekleştirdik.

---@After---
    
    After notasyonu ise test metodlarından sonra çalışmaktadır. After notasyonun da en çok yapılan işlem, 
    test metodlarından sonra her seferinde atanan değerlere null değerler gönderilmektedir.
    @Before ve @After notasyonları her test metodundan sonra çalışabilirken @BeforeClass ve @AfterClass bir kere çalışmaktadır.

---@Test---

    Test notasyonu içerisinde test case’mizde yer alacak adımları tanımlarız. 

---@Ignore---
    
    Yazdığımız test metotlarının çalıştırılmasını istemiyorsak bu amaç ile kullanabileceğimiz bir notasyondur.
    @Ignore notasyonunu ilgili test metodundan önce tanımlamamız yeterli olacaktır.