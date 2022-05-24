package https.github.com.zzckckck3.WebtoonRec.Data.Domain.Entity;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "member")
public class MemberEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50, nullable = false)
    private String email;

    @Column(length = 100, nullable = false)
    private String password;

    @Column
    private String favWebtoon;

    @Builder
    public MemberEntity(Long id, String email, String password, String favWebtoon) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.favWebtoon = favWebtoon;
    }
}
