# Quantity Measurement Application – UC16

## Overview

UC16 enhances the Quantity Measurement Application by introducing **database persistence using JDBC**.  
Previously (UC15), measurement history was stored in an **in-memory cache repository**.  
UC16 replaces or complements this with a **relational database repository implementation**, enabling scalable and persistent storage.

This use case demonstrates enterprise-level architectural practices including:

- Maven based project structure
- JDBC database integration
- Connection pooling
- Repository abstraction
- Dependency injection
- Parameterized SQL queries
- Transaction-safe persistence
- Integration testing using H2 database

---

## Architecture

The application follows **N-Tier Architecture**
