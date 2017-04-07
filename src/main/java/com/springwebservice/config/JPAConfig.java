//package com.springwebservice.config;
//
//import javax.sql.DataSource;
//
//import org.dozer.DozerBeanMapper;
//import org.springframework.context.annotation.*;
//import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.jpa.*;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//@Configuration
//@EnableTransactionManagement
//@ComponentScan("com.mycompany.myproject.persist")
//@EnableJpaRepositories("com.mycompany.myproject.persist")
//public class JPAConfig {
//
//    @Bean(name = "dataSource")
//    public static DataSource dataSource() {
//    	DriverManagerDataSource dataSource = new DriverManagerDataSource();
//    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//    	dataSource.setUrl("jdbc:mysql://localhost:3306/ZZWEB");
//    	dataSource.setUsername("root");
//    	dataSource.setPassword("1106");
//		return dataSource;
//    }
//
//    @Bean(name = "entityManagerFactory")
//    public LocalContainerEntityManagerFactoryBean entityManagerFactoryBean() {
//        LocalContainerEntityManagerFactoryBean factoryBean = new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setPackagesToScan(new String[] { "com.mycompany.myproject.persist" });
//        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
//        vendorAdapter.setShowSql(true);
//        factoryBean.setJpaVendorAdapter(vendorAdapter);
//        return factoryBean;
//    }
//
//    @Bean
//    public PlatformTransactionManager transactionManager() {
//        JpaTransactionManager transactionManager = new JpaTransactionManager();
//        transactionManager.setEntityManagerFactory(entityManagerFactoryBean().getObject());
//        return transactionManager;
//    }
//
//    @Bean
//    public PersistenceExceptionTranslationPostProcessor exceptionTranslation() {
//        return new PersistenceExceptionTranslationPostProcessor();
//    }
//
//    @Bean
//    public DozerBeanMapper getMapper() {
//        return new DozerBeanMapper();
//    }
//    
////    public static void main(String[] args) {
////    	DataSource datasource = dataSource();
////		System.out.println(datasource);
////	}
//
//}
