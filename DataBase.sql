--
-- PostgreSQL database dump
--

-- Dumped from database version 15.1
-- Dumped by pg_dump version 15.1

-- Started on 2023-02-07 20:22:08

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- TOC entry 214 (class 1259 OID 16415)
-- Name: cars; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public.cars (
    id integer NOT NULL,
    brand character varying(20) NOT NULL,
    model character varying(20) NOT NULL,
    engine_type character varying(10) NOT NULL,
    fuel character varying(20),
    torque integer NOT NULL,
    volume double precision,
    power integer NOT NULL,
    transmission character varying(20) NOT NULL,
    gears integer NOT NULL,
    years integer NOT NULL,
    price integer NOT NULL,
    class "char" NOT NULL,
    vin integer NOT NULL,
    color character varying(20) NOT NULL
);


ALTER TABLE public.cars OWNER TO postgres;

--
-- TOC entry 215 (class 1259 OID 16418)
-- Name: cars_id_seq; Type: SEQUENCE; Schema: public; Owner: postgres
--

ALTER TABLE public.cars ALTER COLUMN id ADD GENERATED ALWAYS AS IDENTITY (
    SEQUENCE NAME public.cars_id_seq
    START WITH 0
    INCREMENT BY 1
    MINVALUE 0
    NO MAXVALUE
    CACHE 1
);


--
-- TOC entry 3317 (class 0 OID 16415)
-- Dependencies: 214
-- Data for Name: cars; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (24, 'Volkswagen', 'Polo', 'ICE', 'Petrol', 240, 1.6, 141, 'Auto', 4, 2020, 20000, 'C', 6889022, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (25, 'Volkswagen', 'id.3', 'Electro', NULL, 432, NULL, 176, 'Auto', 1, 2019, 39000, 'C', 3352606, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (0, 'BMW', 'iX', 'Electro', NULL, 630, NULL, 326, 'Auto', 1, 2023, 110000, 'S', 3626510, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (1, 'BMW', 'Z4', 'ICE', 'Petrol', 500, 3, 340, 'Auto', 8, 2021, 44000, 'S', 8580804, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (2, 'BMW', 'M2', 'ICE', 'Petrol', 406, 3, 460, 'Auto', 8, 2022, 63000, 'S', 7326406, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (3, 'Lamborghini', 'Huracan LP 580-2', 'ICE', 'Petrol', 540, 5.2, 580, 'Auto', 7, 2018, 250000, 'S', 5139814, 'Grey');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (4, 'Lamborghini', 'Aventador LP 780-4', 'ICE', 'Petrol', 690, 6.4, 780, 'Auto', 7, 2017, 500000, 'S', 9958959, 'Pink');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (5, 'Lamborghini', 'Urus', 'ICE', 'Petrol', 850, 4, 650, 'Auto', 5, 2018, 230000, 'S', 6800133, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (6, 'Porsche', 'Cayman', 'ICE', 'Petrol', 380, 2, 300, 'Auto', 6, 2016, 63000, 'S', 8493503, 'Brown');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (7, 'Porsche', '911 Turbo-S', 'ICE', 'Petrol', 800, 3.7, 650, 'Auto', 5, 2021, 300000, 'S', 5339475, 'Green');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (8, 'Porsche', 'Taycan', 'Electro', 'Petrol', 1050, NULL, 470, 'Auto', 2, 2020, 89000, 'S', 9546316, 'Purple');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (9, 'Audi', 'RS6', 'ICE', 'Petrol', 700, 4, 600, 'Auto', 8, 2021, 110000, 'E', 2009699, 'Yellow');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (10, 'Audi', 'S7', 'ICE', 'Petrol', 480, 2.9, 440, 'Auto', 7, 2019, 85000, 'E', 3964742, 'Yellow');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (11, 'Audi', 'e-tron GT', 'Electro', NULL, 664, NULL, 300, 'Auto', 5, 2020, 104000, 'E', 4473463, 'Grey');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (12, 'Mercedes-Benz', 'CLS', 'ICE', 'Petrol', 370, 3, 362, 'Auto', 9, 2022, 73000, 'E', 1032752, 'Grey');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (14, 'Mercedes-Benz', 'E-class', 'ICE', 'Petrol', 370, 3, 362, 'Auto', 9, 2022, 67000, 'E', 9664865, 'Red');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (15, 'BMW', '520d', 'ICE', 'Diesel', 380, 2, 181, 'Manual', 6, 2017, 45000, 'E', 6750700, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (16, 'BMW', '540i', 'ICE', 'Petrol', 332, 3, 335, 'Manual', 8, 2021, 65000, 'E', 4231576, 'Red');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (17, 'BMW', 'M5 F90', 'ICE', 'Petrol', 553, 4.4, 600, 'Auto', 8, 2017, 110000, 'E', 9075861, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (18, 'Hyundai', 'Accent', 'ICE', 'Petrol', 164, 1.6, 116, 'Manual', 6, 2019, 16000, 'C', 3808478, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (19, 'Hyundai', 'Elantra', 'ICE', 'Petrol', 178, 2, 128, 'Auto', 4, 2021, 22000, 'C', 2325918, 'Blue');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (20, 'Hyundai', 'i30', 'ICE', 'Petrol', 142, 1.6, 112, 'Auto', 4, 2020, 23000, 'C', 8574900, 'Green');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (21, 'Toyota', 'Corolla', 'ICE', 'Petrol', 190, 2, 143, 'Auto', 4, 2020, 21000, 'C', 6710420, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (22, 'Toyota', 'Auris', 'ICE', 'Petrol', 185, 1.6, 121, 'Auto', 4, 2012, 18000, 'C', 9628934, 'Grey');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (23, 'Toyota', 'Prius', 'Electro', NULL, 283, NULL, 101, 'Manual', 5, 2022, 30000, 'C', 8176821, 'Black');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (26, 'Volkswagen', 'Golf 7', 'ICE', 'Petrol', 350, 2, 163, 'Auto', 7, 2016, 26000, 'C', 2958738, 'White');
INSERT INTO public.cars (id, brand, model, engine_type, fuel, torque, volume, power, transmission, gears, years, price, class, vin, color) OVERRIDING SYSTEM VALUE VALUES (13, 'Mercedes-Benz', 'CLA', 'ICE', 'Diesel', 340, 3, 348, 'Auto', 9, 2022, 72000, 'E', 9817064, 'Red');


--
-- TOC entry 3324 (class 0 OID 0)
-- Dependencies: 215
-- Name: cars_id_seq; Type: SEQUENCE SET; Schema: public; Owner: postgres
--

SELECT pg_catalog.setval('public.cars_id_seq', 26, true);


--
-- TOC entry 3174 (class 2606 OID 16423)
-- Name: cars cars_pkey; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public.cars
    ADD CONSTRAINT cars_pkey PRIMARY KEY (id);


-- Completed on 2023-02-07 20:22:09

--
-- PostgreSQL database dump complete
--

