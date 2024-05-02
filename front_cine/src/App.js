import React from 'react';
import { Navbar, Nav, Form, Button, Container, Row, Col } from 'react-bootstrap';
import axios from 'axios';
import './App.css';

function ReservationForm() {
  const handleCrearReserva = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('http://localhost:8080/crearReserva', {
        // Aquí envía los datos del formulario al backend
        // Puedes acceder a los valores del formulario usando el estado o el evento
      });
      // Manejar la respuesta del backend si es necesario
    } catch (error) {
      // Manejar los errores si ocurre algún problema
      console.error('Error al crear reserva:', error);
    }
  };

  const handleConsultarReserva = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.get('http://localhost:8080/consultarReserva');
      // Manejar la respuesta del backend si es necesario
    } catch (error) {
      // Manejar los errores si ocurre algún problema
      console.error('Error al consultar reserva:', error);
    }
  };

  const handleEliminarReserva = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.delete('http://localhost:8080/eliminarReserva');
      // Manejar la respuesta del backend si es necesario
    } catch (error) {
      // Manejar los errores si ocurre algún problema
      console.error('Error al eliminar reserva:', error);
    }
  };

  return (
    <Container>
      <Navbar bg="light" expand="lg">
        <Navbar.Brand href="#home">Cine XYZ</Navbar.Brand>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="mr-auto">
            <Nav.Link href="#home">Inicio</Nav.Link>
            <Nav.Link href="#link">Peliculas</Nav.Link>
            <Nav.Link href="#link">Contacto</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Navbar>

      <Row className="row_form">
        <Col xs={10} sm={8} md={6}>
          <Form className="form_exterior">
          <Form.Group controlId="formFirstName" className="form_opcion">
              <Form.Label>Nombre</Form.Label>
              <Form.Control type="text" placeholder="Ingrese su nombre" />
            </Form.Group>

            <Form.Group controlId="formLastName" className="form_opcion">
              <Form.Label>Apellidos</Form.Label>
              <Form.Control type="text" placeholder="Ingrese sus apellidos" />
            </Form.Group>

            <Form.Group controlId="formDocType" className="form_opcion">
              <Form.Label>Tipo de Documento</Form.Label>
              <Form.Control as="select">
                <option>Cédula de Ciudadanía</option>
                <option>Tarjeta de Identidad</option>
                <option>Pasaporte</option>
              </Form.Control>
            </Form.Group>

            <Form.Group controlId="formDocNumber" className="form_opcion">
              <Form.Label>Número de Documento</Form.Label>
              <Form.Control type="text" placeholder="Ingrese su número de documento" />
            </Form.Group>

            <Form.Group controlId="formMovie" className="form_opcion">
              <Form.Label>Película</Form.Label>
              <Form.Control as="select">
                <option>El Padrino</option>
                <option>Interestelar</option>
                <option>La La Land</option>
              </Form.Control>
            </Form.Group>

            <Form.Group controlId="formSchedule" className="form_opcion">
              <Form.Label>Horario de la Película</Form.Label>
              <Form.Control as="select">
                <option>10:00 AM</option>
                <option>3:00 PM</option>
                <option>8:00 PM</option>
              </Form.Control>
            </Form.Group>
            <Button variant="primary" type="submit" className="boton_realizar" onClick={handleCrearReserva}>
              Realizar Reserva
            </Button>

            <Button variant="primary" type="submit" className="boton_consultar" onClick={handleConsultarReserva}>
              Consultar Reserva
            </Button>

            <Button variant="primary" type="submit" className="boton_eliminar" onClick={handleEliminarReserva}>
              Eliminar Reserva
            </Button>
          </Form>
        </Col>
      </Row>
    </Container>
  );
}

export default ReservationForm;
