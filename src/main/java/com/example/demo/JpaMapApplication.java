package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

import com.example.demo.model.AddressOneToOneUni;
import com.example.demo.model.AnswerLazyEager;
import com.example.demo.model.CarOneToOneBi;
import com.example.demo.model.EmpManyToMany;
import com.example.demo.model.OwnerOneToOneBi;
import com.example.demo.model.ProjectManyToMany;
import com.example.demo.model.QuestionLazyEager;
import com.example.demo.model.UserOneToOneUni;
import com.example.demo.repository.AddressOneToOneUniRepository;
import com.example.demo.repository.AnswerLazyEagerRepository;
import com.example.demo.repository.CarOneToOneBiRepository;
import com.example.demo.repository.EmpManyToManyRepository;
import com.example.demo.repository.OwnerOneToOneBiRepository;
import com.example.demo.repository.ProjectManyToManyRepository;
import com.example.demo.repository.QuestionLazyEagerRepository;
import com.example.demo.repository.UserOneToOneUniRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;

@SpringBootApplication
@EnableCaching
public class JpaMapApplication implements CommandLineRunner{

	private static final Logger log = LoggerFactory.getLogger(JpaMapApplication.class);
	
	@Autowired
	AddressOneToOneUniRepository addressOneToOneUniRepository;
	
	@Autowired
	UserOneToOneUniRepository uniRepository;
	
	@Autowired
	CarOneToOneBiRepository carOneToOneBiRepository;
	
	@Autowired
	OwnerOneToOneBiRepository oneToOneBiRepository ;
	
	@Autowired
	ProjectManyToManyRepository projectManyToManyRepository ;
	
	@Autowired
	EmpManyToManyRepository empManyToManyRepository ;
	
	@Autowired
	AnswerLazyEagerRepository answerLazyEagerRepository;
	
	@Autowired
	QuestionLazyEagerRepository questionLazyEagerRepository ;
	
	@Autowired
	private EntityManagerFactory entityManagerFactory;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaMapApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		//OneToOne Uni
//		AddressOneToOneUni addressOneToOneUni = new AddressOneToOneUni("mysore");
//		addressOneToOneUniRepository.save(addressOneToOneUni);
//		
//		UserOneToOneUni userOneToOneUni = new UserOneToOneUni("mike", addressOneToOneUni);
//		uniRepository.save(userOneToOneUni);
		
		//OneToOne Bi
//		CarOneToOneBi carOneToOneBi = new CarOneToOneBi("Mercedes");
//		carOneToOneBiRepository.save(carOneToOneBi);
//		
//		OwnerOneToOneBi ownerOneToOneBi = new OwnerOneToOneBi("John Doe");
//		ownerOneToOneBi.setCar(carOneToOneBi);
//		oneToOneBiRepository.save(ownerOneToOneBi);
//		
//		Optional<CarOneToOneBi> optionalCar = carOneToOneBiRepository.findById(1L);
//		Optional<OwnerOneToOneBi> optionalOwner = oneToOneBiRepository.findById(1L);
//		
//		if(optionalCar.isPresent() && optionalOwner.isPresent())
//		{
//			log.info(optionalCar.get()+ " is owned by : "+optionalCar.get().getOwnerOneToOneBi());
//			log.info(optionalOwner.get()+ " has a car : "+optionalOwner.get().getCar());
//		}
		
		//ManyToMany
//		EmpManyToMany e1 = new EmpManyToMany();
//		EmpManyToMany e2 = new EmpManyToMany();
//		
//		e1.setEid(34);
//		e1.setName("Ram");
//		e2.setEid(35);
//		e2.setName("Shyam");
//		
//		ProjectManyToMany p1 = new ProjectManyToMany();
//		ProjectManyToMany p2 = new ProjectManyToMany();
//		
//		p1.setPid(111);
//		p1.setProjectName("Java");
//		p2.setPid(222);
//		p2.setProjectName("Python");
//		
//		List<EmpManyToMany> empList = Arrays.asList(e1,e2);	
//		List<ProjectManyToMany> projectList = Arrays.asList(p1,p2);	
//		System.out.println(empList);
//		System.out.println(projectList);
//		
//		e1.setProjects(projectList);	
//		e2.setProjects(projectList);
//		p1.setEmps(empList);
//		p2.setEmps(empList);
//		
//		empManyToManyRepository.save(e1);
//		empManyToManyRepository.save(e2);
//		projectManyToManyRepository.save(p1);
//		projectManyToManyRepository.save(p2);
		
		//FetchLazy		
		QuestionLazyEager questionLazyEager1 = new QuestionLazyEager();
		questionLazyEager1.setQuestionId(1111);
		questionLazyEager1.setQuestion("what is 1111");
		
		AnswerLazyEager answerLazyEager1 = new AnswerLazyEager();
		answerLazyEager1.setAnswerId(111);
		answerLazyEager1.setAnswer("answer111");
		answerLazyEager1.setQuestions(questionLazyEager1);
		AnswerLazyEager answerLazyEager2 = new AnswerLazyEager();
		answerLazyEager2.setAnswerId(222);
		answerLazyEager2.setAnswer("answer222");
		answerLazyEager2.setQuestions(questionLazyEager1);
		
//		questionLazyEagerRepository.save(questionLazyEager1);
//		answerLazyEagerRepository.save(answerLazyEager1);
//		answerLazyEagerRepository.save(answerLazyEager2);
		
		SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		
//		QuestionLazyEager q =  session.get(QuestionLazyEager.class,1111);
//		System.out.println(q.getQuestionId());
//		System.out.println(q.getQuestion());
//		System.out.println("**************************");
//		//LAZY
//		System.out.println(q.getAnswers().size());
		
		
		
		//First Level Cache
		QuestionLazyEager q =  session.get(QuestionLazyEager.class,1111);
		System.out.println(q);
		System.out.println("**************************");
		QuestionLazyEager q1 =  session.get(QuestionLazyEager.class,1111);
		System.out.println(q1);
		System.out.println(session.contains(q1));
		System.out.println();
		
		Session session2 = sessionFactory.openSession();
		QuestionLazyEager q2 =  session2.get(QuestionLazyEager.class,1111);
		System.out.println(q2);
		System.out.println("**************************");
		QuestionLazyEager q3 =  session2.get(QuestionLazyEager.class,1111);
		System.out.println(q3);
		
		
		session.close();
		session2.close();		
	}
	

}
