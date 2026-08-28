package repositories;

import com.example.ecommerce.entities.Pedido;
import com.example.ecommerce.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
