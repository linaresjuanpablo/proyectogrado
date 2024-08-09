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
   /*SENTENCIA PARA SUMAR LOS VALORES DE UN SOLO DIA*/
   @Query(value="SELECT SUM(f.valor_a_pagar) " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes and " +
           "day(f.fecha_estiamda_de_pago)= :dia", nativeQuery = true)
   Double calculateSumByDia(@Param("ano")String ano, @Param("mes") String mes, @Param("dia") String dia);
   @Query(value="SELECT f.id_contrato, f.estado, " +
           "f.numero_de_factura, f.usuario_pago, f.valor_a_pagar " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes and " +
           "day(f.fecha_estiamda_de_pago)= :dia", nativeQuery = true)
   List<Object[]> findByFacturasDia(@Param("ano")String ano, @Param("mes") String mes, @Param("dia") String dia);


   /* SENTENCIA PARA SUMAR LOS VALORES DE UN MES*/
   @Query(value = "SELECT SUM(valor_a_pagar)" +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes",
           nativeQuery = true)
   Double calcularSumByMes(@Param("ano") String ano, @Param("mes")String mes);
   @Query(value = "SELECT f.id_contrato, f.estado, " +
           "f.numero_de_factura, f.usuario_pago, f.valor_a_pagar " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano and month(f.fecha_estiamda_de_pago) = :mes",
           nativeQuery = true)
   List<Object[]> findByFacturasMes(@Param("ano")String ano, @Param("mes")String mes);


   /* SENTENCIA PARA SUMAR LOS VALORES DE UN AÑO*/
   @Query(value = "SELECT SUM(valor_a_pagar)" +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano",
           nativeQuery = true)
   Double calcularSumByAno(@Param("ano") String ano);
   @Query(value = "SELECT f.id_contrato, f.estado, " +
           "f.numero_de_factura, f.usuario_pago, f.valor_a_pagar " +
           "FROM Facturas f WHERE year(f.fecha_estiamda_de_pago) = :ano",
           nativeQuery = true)
   List<Object[]> findByFacturasAno(@Param("ano")String ano);







}
