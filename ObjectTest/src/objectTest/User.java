package objectTest;

import java.util.Objects;

public class User {
	//고유한 값은 Long타입으로 저장한다.
	private Long id;
	private String name;
	
	public User() {;}

	public User(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

//	alt + shift + s > h > 비교할 필드선택후 엔터 (alt + d 하고 체크하는걸 권장)
//	equals를 재정의
//	Long id 필드를 비교하자! (반드시)
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(id, other.id);
	}

}
