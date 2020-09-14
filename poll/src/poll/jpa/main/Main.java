package poll.jpa.main;

private static final String PERSISTENCE_UNIT_NAME = "poll";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        
        User u = new User();
        u.setUsername("er11");
        
   
        em.persist(u);
         
        em.getTransaction().commit();

        Query q = em.createQuery("select u from User u");
        List<User> uList = q.getResultList();
        for (User user : uList) {
            System.out.println(u.getUsername());
          
        }
        System.out.println("Size: " + uList.size());

        em.close();
