package com.alura.forohubSpring.domain.topic;

public record DatosListadoTopico(
        Long id,
        String titulo,
        String mensaje,
        String fecha,
        String status,
        String autor,
        String curso
) {

    public DatosListadoTopico(Topico topico){
        this(
                topico.getId(),
                topico.getTitulo(),
                topico.getMensaje().toString(),
                topico.getFecha(),
                topico.getStatus(),
                topico.getAutor(),
                topico.getCurso()
        );
    }
    
}
