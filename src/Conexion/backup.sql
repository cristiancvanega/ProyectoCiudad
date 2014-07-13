--
-- PostgreSQL database dump
--

-- Dumped from database version 9.2.8
-- Dumped by pg_dump version 9.2.8
-- Started on 2014-07-13 12:28:13

SET statement_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SET check_function_bodies = false;
SET client_min_messages = warning;

--
-- TOC entry 169 (class 3079 OID 11727)
-- Name: plpgsql; Type: EXTENSION; Schema: -; Owner: 
--

CREATE EXTENSION IF NOT EXISTS plpgsql WITH SCHEMA pg_catalog;


--
-- TOC entry 1925 (class 0 OID 0)
-- Dependencies: 169
-- Name: EXTENSION plpgsql; Type: COMMENT; Schema: -; Owner: 
--

COMMENT ON EXTENSION plpgsql IS 'PL/pgSQL procedural language';


SET search_path = public, pg_catalog;

SET default_tablespace = '';

SET default_with_oids = false;

--
-- TOC entry 168 (class 1259 OID 16394)
-- Name: coordnodos; Type: TABLE; Schema: public; Owner: postgres; Tablespace: 
--

CREATE TABLE coordnodos (
    x integer,
    y integer,
    id integer NOT NULL
);


ALTER TABLE public.coordnodos OWNER TO postgres;

--
-- TOC entry 1917 (class 0 OID 16394)
-- Dependencies: 168
-- Data for Name: coordnodos; Type: TABLE DATA; Schema: public; Owner: postgres
--

COPY coordnodos (x, y, id) FROM stdin;
764	211	39
819	211	40
345	459	76
913	209	41
293	264	42
396	459	77
342	264	43
395	265	44
450	462	78
450	265	45
504	266	46
505	461	79
606	264	47
657	266	48
606	457	80
710	265	49
764	265	50
657	457	81
818	265	51
193	16	1
557	14	2
913	263	52
1041	18	3
196	350	4
291	320	53
1040	345	5
204	663	6
344	322	54
560	666	7
710	460	82
1036	667	8
396	323	55
292	78	9
343	78	10
397	79	11
449	79	12
505	79	13
605	77	14
658	77	15
711	76	16
764	77	17
819	77	18
912	77	19
292	156	20
342	157	21
394	158	22
449	158	23
505	158	24
606	155	25
450	322	56
763	459	83
504	323	57
657	155	26
709	156	27
764	155	28
606	322	58
814	157	29
818	461	84
818	157	30
657	319	59
292	210	31
344	210	32
396	211	33
710	321	60
449	212	34
912	457	85
505	212	35
764	322	61
606	211	36
657	211	37
818	322	62
710	211	38
293	545	86
913	320	63
344	545	87
293	405	64
344	405	65
398	546	88
397	407	66
450	408	67
452	545	89
506	408	68
606	406	69
505	546	90
657	405	70
711	406	71
606	545	91
765	405	72
819	407	73
658	545	92
912	405	74
292	458	75
710	544	93
765	543	94
820	546	95
913	543	96
293	600	97
345	599	98
397	601	99
451	601	100
505	601	101
606	598	102
659	599	103
710	599	104
765	599	105
818	599	106
913	600	107
\.


--
-- TOC entry 1810 (class 2606 OID 16403)
-- Name: co_pk_id; Type: CONSTRAINT; Schema: public; Owner: postgres; Tablespace: 
--

ALTER TABLE ONLY coordnodos
    ADD CONSTRAINT co_pk_id PRIMARY KEY (id);


--
-- TOC entry 1924 (class 0 OID 0)
-- Dependencies: 5
-- Name: public; Type: ACL; Schema: -; Owner: postgres
--

REVOKE ALL ON SCHEMA public FROM PUBLIC;
REVOKE ALL ON SCHEMA public FROM postgres;
GRANT ALL ON SCHEMA public TO postgres;
GRANT ALL ON SCHEMA public TO PUBLIC;


-- Completed on 2014-07-13 12:28:13

--
-- PostgreSQL database dump complete
--

