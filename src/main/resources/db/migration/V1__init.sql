CREATE TABLE assets (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    description TEXT,
    purchase_date DATE
);

CREATE TABLE maintenance_tasks (
    id BIGSERIAL PRIMARY KEY,
    asset_id BIGINT NOT NULL REFERENCES assets(id),
    description TEXT NOT NULL,
    due_date DATE,
    status TEXT NOT NULL
);

CREATE TABLE consumables (
    id BIGSERIAL PRIMARY KEY,
    name TEXT NOT NULL,
    quantity INT NOT NULL
);
