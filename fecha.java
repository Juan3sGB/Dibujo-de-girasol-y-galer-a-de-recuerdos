const FECHA_INICIO = "2026-08-11T18:30:00";

function curvaPetalo(theta){

    const A=7.5;
    const B=7.2;

    const r =
        A +
        B*Math.cos(13*theta);

    return {
        x:r*Math.cos(theta),
        y:r*Math.sin(theta)
    };
}