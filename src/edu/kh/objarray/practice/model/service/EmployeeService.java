package edu.kh.objarray.practice.model.service;

import java.util.Arrays;
import java.util.Scanner;


import edu.kh.objarray.practice.model.vo.Employee;

public class EmployeeService {
	private Employee[] employees = new Employee[3]; // 사원 정보를 저장할 Employee 배열
	private Scanner sc = new Scanner(System.in); 
	private Employee loginMember = null;
	
	public void displayMenu() {
		
		int sel = 0;
		do {
			
			System.out.println("=== 직원 관리 프로그램 ===");
			System.out.println("1. 직원 정보 입력(3명)");
			System.out.println("2. 모든 직원 정보 출력");
			System.out.println("3. 특정 직원 정보 출력(이름 검색)");
			System.out.println("4. 특정 직원 급여/연봉 출력(사번 검색)");
			System.out.println("5. 모든 직원 급여 합/연봉 합 출력");
			System.out.println("6. 모든 직원중 급여가 가장 높은 직원의 이름, "
					+ "부서, 급여 출력");
			System.out.println("0. 종료");
			System.out.print("메뉴 선택 >> ");
			sel = sc.nextInt();
			sc.nextLine();
			
			switch (sel) {
			case 1: initEmployee(); break;
			case 2: allEmployeesInformation();break;
			case 3: searchEmployee(); break;
			case 4:  break;
			case 5:  break;
			case 6:  break;
			case 0: System.out.println("프로그램 종료."); break;

			default: System.out.println("잘못 입력하셨습니다.");
			}
			
		}while(sel != 0);
	}
		// 3명의 직원 정보를 입력받아 배열에 각 요소에 초기화  
		public void initEmployee() {
			// 사번, 이름, 부서, 직급, 급여 순서로 입력받기
			
			
			//새로운 회원 정보를 저장할 공간이 있ㄲ는지 확인하고
		int index = emptyIndex();
	//	System.out.println("현재 회원수"+index);
		
		
		
		if(index == -1) {
			System.out.println ("입력이 불가능합니다(인원수 초과)");
		}
		
		
		for(int i = 0; i<employees.length; i++) {
			
		
			System.out.println("사번 :");
			int empNo = sc.nextInt();
			
			System.out.println("사원명 :");
			String empName = sc.next();
			
			System.out.println("부서 :");
			String dept = sc.next();
			
			System.out.println("직급 :");
			String job = sc.next();
			
			System.out.println("급여 :");
			int salary = sc.nextInt();
			
			
			
			
		
				//Member 객체를 생성해 할당된 주소를 MemberArr 비어있는 인덱스에 대입
			employees[index] =  new Employee(empNo,empName,dept,job, salary);
				System.out.println("입력성공");
		}
		
		}
		//memberArr의 비어있는 인덱스 번호를 반환하는 매서드
		//단 비어있는 인덱스가 없으면 -1 반환
		
		public  int  emptyIndex() {
			//memberArr배열을 0번 인덱스부터 끝까지 접근해서
			//참조하는 값이 null인 경우 인덱스를 반환
			
			for(int i =0; i<employees.length; i++) {
				if(employees[i] ==null) {
					return i;
				}
			}
			
			return -1;
		}
		
		
		
		
		
		// 모든 직원 정보를 하나의 문자열로 반환
		public String allEmployeesInformation() {
			
			
			
			//1) employees배열 내 요소를 순서대로 접근하여 null이 아닌지 확인
			for(int i =0; i<employees.length; i++) {
				//회원 정보가 있을 경우
					if(employees[i] != null) {
						//2)회원정보(employees[i]의 아이디, 비밀번호와)
						//입력받은 아이디, 비밀번호가 같은지 확인
					
					
					System.out.println(Arrays.deepToString(employees));
						
						//3)로그인 회원정보 객체(member)를 참조하는 변수  login
						// Member에 현재 접근중인 memberArr[i]요소에 저장된 주소를 얕은 복사
						//loginMember =memberArr[i];//그냥 대입하면 얕은복사
						loginMember=employees[i];
						break; // 더 이상 같은 아이디 비밀번호 없으므로 for문 종료
						
					
					}
					}//for문 끝
			//4 로그인 성공 실패 여부에 따라 결과값 반환
			if(loginMember == null ) {//로그인 실패
				
				return "정보가 없습니다";
				
			
			}else { //로그인 성공
				return loginMember+ "환영합니다"	;	
				
				}
			
		}
		
		// 특정 사원 정보 반환 메소드(이름 검색)
		// 일치하는 이름이 없을 경우 "일치하는 이름의 사원이 없습니다." 반환
		public String searchEmployee() {
			
			return null;
		}
		
		
		// 입력받은 사번과 일치하는 직원의 급여, 연봉 정보 반환(연봉 == 급여 * 12)
		// 일치하지 않는 경우 "사번이 일치하는 직원 없습니다." 반환
		public String salaryCheck() {
			
			return null;
		}
		
		
		// 모든 사원 급여 합 반환
		public int allSalaryCheck() {
			
			return 0;
		}
		
		// 모든 직원중 급여가 가장 높은 직원 출력
		// (동일한 급여인 경우 사번이 낮은 사람이 출력)
		public void topSalaryEmployee() {
		
		}
	}