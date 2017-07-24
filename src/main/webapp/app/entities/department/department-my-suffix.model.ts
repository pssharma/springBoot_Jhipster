import { BaseEntity } from './../../shared';

export class DepartmentMySuffix implements BaseEntity {
    constructor(
        public id?: string,
        public departmentName?: string,
    ) {
    }
}
