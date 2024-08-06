package datosAbiertos.ProyectoGrado.Repository;

import datosAbiertos.ProyectoGrado.Dto.DepartamentoResponseDto;
import datosAbiertos.ProyectoGrado.Dto.FacturasResponseDto;
import datosAbiertos.ProyectoGrado.Model.Facturas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FacturasRepository extends JpaRepository<Facturas, Long> {
   /*sentencia para sumar los valores de un solo dia*/
   @Query(value="SELECT SUM(f.valor_a_pagar) " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes and " +
           "day(f.fecha_estiamda_de_pago)= :dia", nativeQuery = true)
   Double calculateSumByDia(@Param("ano")String ano, @Param("mes") String mes, @Param("dia") String dia);
   @Query(value="SELECT f.id_contrato, f.estado, " +
           "f.numero_de_factura, f.usuario_pago, f.valor_a_pagar " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes and " +
           "day(f.fecha_estiamda_de_pago)= :dia", nativeQuery = true)
   List<Object[]> findByFacturasDia(@Param("ano")String ano, @Param("mes") String mes, @Param("dia") String dia);




   /*sentencia para sumar los valores de un MES*/
   @Query("SELECT SUM(valor_a_pagar)" +
           "FROM Facturas WHERE fecha_estiamda_de_pago LIKE :mes%")
   Double calcularSumByMes(@Param("mes") String mes);
   @Query(value = "SELECT new datosAbiertos.ProyectoGrado.Dto.FacturasResponseDto (id_contrato, estado, " +
           "numero_de_factura, usuario_pago, valor_a_pagar, 0.0)" +
           "   FROM Facturas WHERE fecha_estiamda_de_pago  LIKE :mes%")
   List<FacturasResponseDto> findByFacturasMes(@Param("mes")String mes);







}
