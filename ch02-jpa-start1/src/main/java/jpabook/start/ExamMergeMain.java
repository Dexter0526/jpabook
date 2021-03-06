package jpabook.start;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ExamMergeMain {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");
	
	public static void main(String[] args) {
		Member member = createMember("memberC", "회원1", 10);
		
		member.setUsername("회원명변경");
		
		mergerMember(member);
	}

	private static void mergerMember(Member member) {
		EntityManager em2 = emf.createEntityManager();
		EntityTransaction tx2 = em2.getTransaction();
		
		tx2.begin();
		Member mergeMember = em2.merge(member);
		tx2.commit();
		
		// 준영속 상태
		System.out.println("member = " + member.getUsername());
		
		// 영속 상태
		System.out.println("mergeMember = " + mergeMember.getUsername());
		
		System.out.println("em2 contains member = " + em2.contains(member));
		System.out.println("em2 contains mergeMember = " + em2.contains(mergeMember));
	}

	private static Member createMember(String id, String username, Integer age) {
		EntityManager em1 = emf.createEntityManager();
		EntityTransaction tx1 = em1.getTransaction();
		tx1.begin();
		
		Member member = new Member();
		member.setId(id);
		member.setUsername(username);
		member.setAge(age);
		
		em1.persist(member);
		tx1.commit();
		
		em1.close();
		
		return member;
	}
}
