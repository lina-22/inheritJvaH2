package h2.com.jpainheritjoinedtable;

import h2.com.jpainheritjoinedtable.model.Archer;
import h2.com.jpainheritjoinedtable.model.Infantry;
import h2.com.jpainheritjoinedtable.model.InfantryType;
import h2.com.jpainheritjoinedtable.model.Knight;
import h2.com.jpainheritjoinedtable.repository.ArcherRepository;
import h2.com.jpainheritjoinedtable.repository.InfantryRepository;
import h2.com.jpainheritjoinedtable.repository.KnightRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JpaInheritJoinedTableApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext configurableApplicationContext =
				SpringApplication.run(JpaInheritJoinedTableApplication.class, args);

		InfantryRepository archerRepository =
				configurableApplicationContext.getBean(ArcherRepository.class);

		InfantryRepository knightRepository =
				configurableApplicationContext.getBean(KnightRepository.class);

		Infantry archer =
				new Archer(InfantryType.LIGHT, 300, 500, 100, 1000);

		Infantry knight =
				new Knight(InfantryType.HEAVY, 280, 1000, 300, true);

		archerRepository.save(archer);
		knightRepository.save(knight);

		//archerRepository.delete(archer);
	}

}
