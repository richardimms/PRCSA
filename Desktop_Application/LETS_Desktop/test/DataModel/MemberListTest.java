/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataModel;

import java.sql.Date;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Richard
 */
public class MemberListTest {
    MemberList memberList = new MemberList();
    Member member1;
    Member member2;
    
    /**
     *
     */
    public MemberListTest() {
    }
    
    /**
     *
     */
    @Before
    public void setUp() {
        Date dob1 = new Date(1/2/92);
        Date dob2 = new Date(2/2/93);
        
        Address add1 = new Address("20 Deptford Place","North Hill","Devon","PL4 8JL");
        Address add2 = new Address("52 Leek Lane","","Stoke-On-Trent","ST8 7NX");

        member1 = new Member(0,"Rich","Imms",dob1,"richimms@gmail.com","07527952051",add1,"Y");
        member2 = new Member(1,"Zoe","Strawbridge",dob2,"zast@ymail.com","07862626",add2,"N");
 
        memberList.addMember(member1);
        memberList.addMember(member2);
    }
    
    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     *
     */
    @Test
    public void testAddMember() {
        Member member3 = new Member();
        memberList.addMember(member3);
        int expected = 3;
        int result = this.memberList.memberListSize();
        assertEquals("Member List size does not match the expected size ",expected,result);
    }

    /**
     *
     */
    @Test
    public void testGetSize() {
        int expected = 2;
        int result = memberList.memberListSize();
        assertEquals("Member List size does not match the expected size",expected,result);
    }

    /**
     *
     */
    @Test
    public void testGetMemberAt() {
        Member expected = member1;
        Member result  = this.memberList.getMemberAt(0);
        assertEquals("The member returned does not match the expected size",expected,result);
    }

    /**
     *
     */
    @Test
    public void testFindMemberByID() {
        int id = 1;
        Member expected = member2;
        Member result = this.memberList.findMemberByID(id);
        memberList.findMemberByID(id);
        assertEquals("",expected,result);
    }   
}
